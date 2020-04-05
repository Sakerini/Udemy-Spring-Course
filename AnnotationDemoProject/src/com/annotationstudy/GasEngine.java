package com.annotationstudy;

import org.springframework.stereotype.Component;

@Component
public class GasEngine implements Engine {

    @Override
    public String fuelInformation() {
        return "Gas Engine";
    }
}
