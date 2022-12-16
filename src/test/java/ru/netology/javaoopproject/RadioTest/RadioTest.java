package ru.netology.javaoopproject.RadioTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaoopproject.Radio.Radio;

public class RadioTest {

    @Test
    public void getStationAmountIfDoNotWantPoint() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getStationAmount());
    }

    @Test
    public void getStationAmountIfWantPoint() {
        Radio radio = new Radio(20);

        Assertions.assertEquals(20, radio.getStationAmount());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 5;

        int expected = 5;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 99;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio();

        radio.setToMinVolume();


        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 6;
        radio.increaseVolume();

        int expected = 7;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeIfMax() {
        Radio radio = new Radio();

        radio.currentVolume = 99;
        radio.increaseVolume();

        int expected = 99;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 5;
        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseCurrentVolumeIfMin() {
        Radio radio = new Radio();

        radio.currentVolume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.currentStation = 5;

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLastStation() {
        Radio radio = new Radio();

        radio.setToLastStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstStation() {
        Radio radio = new Radio();

        radio.setToFirstStation();


        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.currentStation = 5;
        radio.getNextStation();

        int expected = 6;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFirstStationIfLast() {
        Radio radio = new Radio();

        radio.currentStation = 9;
        radio.getNextStation();

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.currentStation = 6;
        radio.getPrevStation();

        int expected = 5;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLastStationIfFirst() {
        Radio radio = new Radio();

        radio.currentStation = 0;
        radio.getPrevStation();

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfLast() {
        Radio radio = new Radio();

        radio.currentStation = 9;
        radio.getPrevStation();

        int expected = 8;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }
}