package com.example.dagger2.car;

import android.util.Log;

import com.example.dagger2.car.Car;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote(){

    }
    public void setListener(Car car){
        Log.d(TAG, "Remote Connected");
                

    }
}
