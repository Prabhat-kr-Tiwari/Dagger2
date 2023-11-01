package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2.car.Car;
import com.example.dagger2.dagger.CarComponent;
import com.example.dagger2.dagger.DaggerCarComponent;
import com.example.dagger2.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//    private  Car car;


    //2nd way
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  Engine engine=new Engine();
        Wheels wheels=new Wheels();
        Car car =new Car(engine,wheels);
        car.drive();*/

//        CarComponent carComponent=DaggerCarComponent.create();
        CarComponent carComponent= DaggerCarComponent.builder().dieselEngineModule(new DieselEngineModule(100)).build();
        //field injection
        carComponent.inject(this);
//        car=carComponent.getCar();

        //2nd way

        car.drive();


    }
}