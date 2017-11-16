package com.mercadolibre.dojos;

/**
 * Created by gcampoy on 11/16/17.
 */
public class Weight {

    private int value;

    public Weight(int weightValue) {
        value = weightValue;
    }

    public int value() {
        return value;
    }

    public void increment(int weight) {
        value = value + weight;
    }
}
