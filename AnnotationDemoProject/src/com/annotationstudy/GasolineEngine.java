package com.annotationstudy;

import org.springframework.stereotype.Component;

@Component
public class GasolineEngine implements Engine {

    @Override
    public String fuelInformation() {
        return "Gasoline Engine";
    }
}
