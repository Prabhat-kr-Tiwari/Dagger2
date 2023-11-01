package com.example.dagger2.dagger;


import com.example.dagger2.car.DieselEngine;
import com.example.dagger2.car.Engine;
import com.example.dagger2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/*@Module
public class PetrolEngineModule {
    @Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;
    }

}*/
//we can optimize the above class
/*@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);

}*/

//binds doesnot work with  any configuration
@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }



    //dagger don't care about the horesePower it care about the return type  so whenever it will get an integer value it will assign to this
    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    /*@Provides
    //this method cannot be declared as static because it depends on the instance variable
    Engine provideEngine(){
        return new DieselEngine(horsePower);
    }*/


    //now we don't need to do this manually
    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }
}


