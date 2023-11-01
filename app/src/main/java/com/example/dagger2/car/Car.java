package com.example.dagger2.car;

import android.util.Log;

import javax.inject.Inject;

//public class Car {
//}
public class Car {


    private static final String TAG = "Car";
  /*  private Engine engine;
    private Wheels wheels;*/

    @Inject
    Engine engine;
    private Wheels wheels;


    //constructor
    /*@Inject
    Car(Engine engine,Wheels wheels){
        this.engine=engine;
        this.wheels=wheels;

    }*/
    @Inject
    Car(Wheels wheels){

        this.wheels=wheels;

    }

    //method injection
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);

    }

    public void drive(){
        engine.start();

        Log.d(TAG, "driving ");
    }

}

