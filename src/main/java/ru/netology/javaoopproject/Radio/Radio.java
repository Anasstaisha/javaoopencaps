package ru.netology.javaoopproject.Radio;

public class Radio {

    private final int stationAmount;

    public Radio() {
        this.stationAmount = 10;
    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int getStationAmount() {
        return stationAmount;
    }

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setToLastStation() {
        currentStation = 9;
    }

    public void setToFirstStation() {
        currentVolume = 0;
    }

    public void getNextStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation -= 9;
        }
    }

    public void getPrevStation() {
        if (currentStation < 1) {
            currentStation += 9;
        } else {
            currentStation--;
        }
    }
    public int currentVolume;

    public void setToMaxVolume() {
        currentVolume = 99;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume >= 99) {
            currentVolume = currentVolume + 0;
        } else {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 1) {
            currentVolume = currentVolume + 0;
        } else {
            currentVolume--;
        }
    }
}