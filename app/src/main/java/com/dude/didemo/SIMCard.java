package com.dude.didemo;

import android.util.Log;

public class SIMCard {

    private ServiceProvider serviceProvider;
    private static final String TAG = "SmartPhone";

    public SIMCard(ServiceProvider serviceProvider) {
        this.serviceProvider=serviceProvider;
        Log.d(TAG, "SIM Card set ");
    }
}
