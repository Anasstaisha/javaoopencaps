package ru.netology.javaoopproject.Radio;

public class Radio {
    public int currentVolume;

    public void setToMaxVolume() {
        currentVolume = 9;
    }

    public void setToMinVolume() {
        currentVolume = 1;
    }

    public void increaseVolume() {
        if (currentVolume >= 9) {
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

    public int currentStation;

    public void setToLastStation() {
        currentVolume = 9;
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
}