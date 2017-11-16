package com.mercadolibre.dojos;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests for the dojo.
 */
public class DojoTest {

    @Test
    public void Should_get_fat_whether_it_eats_biscuits() {

        Biscuit biscuit = new Biscuit();
        Pacman pacman = new Pacman();
        Weight initialWeight = pacman.getWeight();

        pacman.eat(biscuit);

        assertTrue(pacman.isFatterThan(initialWeight));

    }

    @Test
    public void Should_get_fat_whether_it_eats_cherry() {
        //Given un pacman y un cherry
        Cherry cherry = new Cherry();
        Pacman pacman = new Pacman();
        Weight initialWeight = pacman.getWeight();

        //when come una cherry
        pacman.eat(cherry);

        //Then su peso se duplica
        assertTrue(pacman.weightIsDuplicated(initialWeight));
    }

    @Test
    public void pacmanInitsWithWeightDistiZero() throws Exception {
        //given un pacman inicializado con peso cero
        Cherry cherry = new Cherry();
        Pacman pacman = new Pacman();
        Weight initialWeight = pacman.getWeight();
        //when come una cherry
        pacman.eat(cherry);
        //then su peso debe ser 10
        System.out.println("pacman = " + pacman.getWeight().value());
        assertTrue(pacman.getWeight().value() == 10);
    }

    @Test
    public void pacmanIsNotEatThenTheWeightDoesNotChange() throws Exception {
        Pacman pacman = new Pacman();

        assertTrue(pacman.getWeight().value() == 0);
    }
}
