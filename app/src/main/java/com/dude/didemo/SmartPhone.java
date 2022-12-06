package com.dude.didemo;

import android.util.Log;

public class SmartPhone {

    public Battery battery;
    public MemoryCard memoryCard;
    public SIMCard simCard;
    private static final String TAG = "SmartPhone";

//    public SmartPhone(Battery battery, MemoryCard memoryCard, SIMCard simCard) {
//        this.battery = battery;
//        this.memoryCard = memoryCard;
//        this.simCard = simCard;
//    }

    public SmartPhone(){}

    public void makeACall(){
        Log.d(TAG, " making a call......... ");
    }
}
