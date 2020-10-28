package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentRadioStation;
    private int firstRadioStation = 0;
    private int lastRadioStation = 10;
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > lastRadioStation)
            return;
        if (currentRadioStation < firstRadioStation)
            return;
        this.currentRadioStation = currentRadioStation;
    }

    public int getFirstRadioStation() {
        return firstRadioStation;
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume)
            return;
        if (currentSoundVolume < minSoundVolume)
            return;
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void changeNextRadioStation() {
        if (currentRadioStation == lastRadioStation) {
            this.currentRadioStation = firstRadioStation;
        }
        else {
            currentRadioStation++;
        }
    }

    public void changePrevRadioStation() {
        if (currentRadioStation == firstRadioStation) {
            this.currentRadioStation = lastRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void increaseCurrentSoundVolume() {
        if (currentSoundVolume < maxSoundVolume)
            currentSoundVolume++;
    }

    public void decreaseCurrentSoundVolume() {
        if (currentSoundVolume > minSoundVolume)
            currentSoundVolume--;
    }
}
