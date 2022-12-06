package com.dude.didemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Battery battery = new Battery();
        MemoryCard memoryCard = new MemoryCard();

        ServiceProvider serviceProvider = new ServiceProvider();
        SIMCard simCard = new SIMCard(serviceProvider);

        //Constructor Injection
        //SmartPhone smartPhone = new SmartPhone(battery,memoryCard,simCard);

        // Method Injection
        //smartPhone.setBattery(battery);

        // Field Injection
        //smartPhone.Battery = battery;

        //smartPhone.makeACall();
    }
}