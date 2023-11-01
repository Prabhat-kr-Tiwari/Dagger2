package com.example.dagger2.dagger;


import com.example.dagger2.car.Engine;
import com.example.dagger2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/*@Module
public class PetrolEngineModule {
    @Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;
    }

}*/
//we can optimize the above class
@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}

