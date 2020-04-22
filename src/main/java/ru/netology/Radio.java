package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentStation;
    private int volume;
    private int maxStation = 9;
    private int maxVolume = 100;
    private int minStation = 0;
    private int minVolume = 0;
    private boolean on = true;

    public Radio(int currentStation, int maxStation) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
    }

    public Radio(int volume) {
        this.volume = volume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            this.volume = maxVolume;
            return;
        }
        if (volume < minVolume) {
            this.volume = minVolume;
            return;
        }
        this.volume = volume;
    }

    public void increaseCurrentStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void decreaseCurrentStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void increaseVolume() {
        if (volume == maxVolume) {
            return;
        }
        volume++;
    }

    public void decreaseVolume() {
        if (volume == minVolume) {
            return;
        }
        volume--;
    }
}





