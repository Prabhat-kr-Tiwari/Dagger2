package com.example.dagger2.car;

import com.example.dagger2.car.Rims;
import com.example.dagger2.car.Tires;

public class Wheels {

    /*@Inject
    public Wheels(){

    }*/

    //we don't know about this class so we can't annotate withe @inject
    private Rims rims;
    private Tires tires;
    public Wheels(Rims rims, Tires tires){
        this.rims=rims;
        this.tires=tires;

    }

}
