package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldIncreaseCurrentStation() {
        Radio radio = new Radio(5, 9);
        radio.increaseCurrentStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseCurrentStationFromMax() {
        Radio radio = new Radio(9, 9);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldDecreaseCurrentStation() {
        Radio radio = new Radio(5, 9);
        radio.decreaseCurrentStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldDecreaseCurrentStationFromMin() {
        Radio radio = new Radio(0, 12);
        radio.decreaseCurrentStation();
        assertEquals(12, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationFromMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio(25);
        radio.increaseVolume();
        assertEquals(26, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeFromMax() {
        Radio radio = new Radio(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeFromMin() {
        Radio radio = new Radio(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetVolumeFromMax() {
        Radio radio = new Radio();
        radio.setVolume(101);
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldSetVolumeFromMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        assertEquals(0, radio.getVolume());
    }
}
