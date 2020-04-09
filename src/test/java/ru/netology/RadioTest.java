package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void ShouldIncreaseCurrentStation() {
        radio.setCurrentStation(5);
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.increaseCurrentStation(5);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void ShouldDecreaseCurrentStation() {
        radio.setCurrentStation(5);
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.decreaseCurrentStation(5);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void ShouldIncreaseVolume() {
        radio.setVolume(9);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.increaseVolume(9);
        assertEquals(10, radio.getVolume());
    }

    @Test
    void ShouldDecreaseVolume() {
        radio.setVolume(1);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.decreaseVolume(1);
        assertEquals(0, radio.getVolume());
    }
}
