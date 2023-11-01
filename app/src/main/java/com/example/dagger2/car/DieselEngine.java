package com.example.dagger2.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {


    private static final String TAG = "Car";
    private int horsePower;

//    @Inject


    @Inject
    public DieselEngine(int horsePower){
        this.horsePower=horsePower;

    }
    @Override
    public void start() {
        Log.d(TAG, "Diesel ENgine started : Horse Power"+horsePower);

    }
}
