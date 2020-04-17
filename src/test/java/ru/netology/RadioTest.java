package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void ShouldIncreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.increaseCurrentStation();
        assertEquals(6, radio.getCurrentStation());
    }


    @Test
    void ShouldIncreaseCurrentStationFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    void ShouldDecreaseCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.decreaseCurrentStation();
        assertEquals(4, radio.getCurrentStation());
    }


    @Test
    void ShouldDecreaseCurrentStationFromMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    void ShouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    void ShouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }


    @Test
    void ShouldIncreaseVolumeFromMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    void ShouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }


    @Test
    void ShouldDecreaseVolumeFromMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }


    @Test
    void ShouldSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(10);
        assertEquals(10, radio.getVolume());
    }
}
