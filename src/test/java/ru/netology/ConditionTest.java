package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(20);
        condition.increaseCurrentTemperature();

        assertEquals(21, condition.getCurrentTemperature());
    }


    @Test
    public void shouldIncreaseCurrentTemperatureFromMax() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(35);
        condition.increaseCurrentTemperature();

        assertEquals(35, condition.getCurrentTemperature());
    }



    @Test
    public void shouldDecreaseCurrentTemperature() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(20);
        condition.decreaseCurrentTemperature();

        assertEquals(19, condition.getCurrentTemperature());
    }


    @Test
    public void shouldDecreaseCurrentTemperatureFromMin() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(15);
        condition.decreaseCurrentTemperature();

        assertEquals(15, condition.getCurrentTemperature());
    }
}

