package ru.netology;

public class Radio {
    private int currentStation;
    private int volume;
    private int maxStation;
    private int maxVolume;
    private int minStation;
    private int minVolume;

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxStation() {
        return minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public void increaseCurrentStation(int currentStation) {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        }
        this.currentStation = currentStation + 1;
    }

    public void decreaseCurrentStation(int currentStation) {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        }
        this.currentStation = currentStation - 1;
    }

    public void increaseVolume(int volume) {
        if (volume == maxVolume) {
            return;
        }
        this.volume = volume + 1;
    }

    public void decreaseVolume(int volume) {
        if (volume == minVolume) {
            return;
        }
        this.volume = volume - 1;
    }
}


