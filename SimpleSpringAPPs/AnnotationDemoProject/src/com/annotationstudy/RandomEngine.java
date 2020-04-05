package com.annotationstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomEngine implements Engine {
    private List<Engine> engines;
    private Random randomGenerator = new Random();

    @Autowired
    private void setEngines(){
        List<Engine> engineList = new ArrayList<>();

        engineList.add(new GasEngine());
        engineList.add(new GasolineEngine());
        engineList.add(new DieselEngine());

        engines = engineList;
    }

    @Override
    public String fuelInformation() {
        return engines.get(randomGenerator.nextInt(engines.size())).fuelInformation();
    }
}
