package com.example.dagger2.car;

import javax.inject.Inject;

/*public class Engine {

    @Inject
    public Engine(){

    }
}*/
//what if engine is an interface not a class
public interface Engine {

    void start();

}
