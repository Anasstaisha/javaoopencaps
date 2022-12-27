package ru.netology.javaoopproject.Radio;

public class Radio {

    private int maxStation;
    private int currentVolume;
    private  int currentStation;
    private  int maxVolume;
    private int stationAmount;


    public Radio() {
        maxStation = 9;
        maxVolume = 99;
        stationAmount = maxStation;
    }

    public Radio(int stationAmount) {
        maxStation = stationAmount - 1;
    }

    public int getStationAmount() {
        return stationAmount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }


    public void increaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
            return;
        }
            currentVolume = maxVolume;
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
            return;
        }
            currentVolume = 0;
    }
}