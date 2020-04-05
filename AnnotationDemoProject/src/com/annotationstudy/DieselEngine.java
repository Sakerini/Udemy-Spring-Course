package com.annotationstudy;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine{
    @Override
    public String fuelInformation() {
        return "DieselEngine";
    }
}
