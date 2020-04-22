package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void ShouldIncreaseCurrentStation() {
        Radio radio = new Radio(5,9);
        radio.increaseCurrentStation();
        assertEquals(6, radio.getCurrentStation());
    }


    @Test
    void ShouldIncreaseCurrentStationFromMax() {
        Radio radio = new Radio(9,9);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    void ShouldDecreaseCurrentStation() {
        Radio radio = new Radio(5, 9);
        radio.decreaseCurrentStation();
        assertEquals(4, radio.getCurrentStation());
    }


    @Test
    void ShouldDecreaseCurrentStationFromMin() {
        Radio radio = new Radio(0, 12);
        radio.decreaseCurrentStation();
        assertEquals(12, radio.getCurrentStation());
    }


    @Test
    void ShouldSetStation() {
        Radio radio = new Radio(9, 9);
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    void ShouldIncreaseVolume() {
        Radio radio = new Radio(25);
        radio.increaseVolume();
        assertEquals(26, radio.getVolume());
    }


    @Test
    void ShouldIncreaseVolumeFromMax() {
        Radio radio = new Radio(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void ShouldDecreaseVolume() {
        Radio radio = new Radio(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getVolume());
    }


    @Test
    void ShouldDecreaseVolumeFromMin() {
        Radio radio = new Radio(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }


    @Test
    void ShouldSetVolume() {
        Radio radio = new Radio(50);
        assertEquals(50, radio.getVolume());
    }
}
