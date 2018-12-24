package com.adam.microservices.limitsservice.bean;

import lombok.Data;

@Data
public class LimitConfiguration {
    private int maximum;
    private int minimum;

    protected LimitConfiguration() {

    }

    public LimitConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }
}
