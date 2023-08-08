package org.example;

public class Radio {
    private int currentRadioNumber;
    private int currentVolume;

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public void setCurrentRadioNumber(int newCurrentRadioNumber) {
        if (newCurrentRadioNumber < 0) {
            return;
        }
        if (newCurrentRadioNumber > 9) {
            return;
        }
        currentRadioNumber = newCurrentRadioNumber;
    }

    public void next() {
        if (currentRadioNumber < 9) {
            currentRadioNumber++;
        } else currentRadioNumber = 0;
    }

    public void prev() {
        if (currentRadioNumber > 0) {
            currentRadioNumber--;
        } else currentRadioNumber = 9;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}






