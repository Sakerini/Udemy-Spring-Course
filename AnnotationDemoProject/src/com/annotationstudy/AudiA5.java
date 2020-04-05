package com.annotationstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("MyAudi")
public class AudiA5 implements Car {

    @Value("${myaudi.ownername}")
    private String ownerName;
    @Value("${myaudi.carnumber}")
    private String carNumber;

    @Autowired
    @Qualifier("randomEngine")
    private Engine engine;

    /*
    @Autowired
    public AudiA5(Engine engine) {
        this.engine = engine;
    }
    */
    /*
    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
     */

    @Override
    public String getDailyFuelExpenses() {
        return "This Car is has 10 liters per 100 km Expenses";
    }

    @Override
    public String getEngineInformation() {
        return engine.fuelInformation();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCarNumber() {
        return carNumber;
    }
}
