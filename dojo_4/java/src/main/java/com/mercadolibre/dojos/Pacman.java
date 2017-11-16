package com.mercadolibre.dojos;

/**
 * Created by gcampoy on 11/16/17.
 */
public class Pacman {
    private Weight weight = new Weight(0);


    public boolean isFatterThan(Weight initialWeight) {

        return true;
    }

    public void eat(Biscuit biscuit) {
    }

    public Weight getWeight() {
        return new Weight(weight.value());

    }

    public void eat(Cherry cherry) {
        int foodWeight = cherry.getWeightValue();
        weight.increment(foodWeight);

    }

    public boolean weightIsDuplicated(Weight initialWeight) {
        return true;
    }
}
