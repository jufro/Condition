package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(20);
        condition.setMaxTemperature(35);
        condition.setMinTemperature(15);
        condition.increaseCurrentTemperature(20);
        assertEquals(21, condition.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Condition condition = new Condition();

        condition.setCurrentTemperature(20);
        condition.setMaxTemperature(35);
        condition.setMinTemperature(15);
        condition.decreaseCurrentTemperature(20);
        assertEquals(19, condition.getCurrentTemperature());
    }
}

