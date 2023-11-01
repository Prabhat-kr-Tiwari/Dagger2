package com.example.dagger2.car;

import android.util.Log;

import com.example.dagger2.car.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";
    private int horsePower;

    @Inject
    public PetrolEngine(int horsePower){
        this.horsePower=horsePower;

    }
    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine started   Horsepower  "+horsePower);

    }
}
