package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class RadioTest {
    @Test
    public void shouldFindNumberOfRadio() {
        Radio radio = new Radio(20);

        Assertions.assertEquals(20, radio.getNumberOfRadios());
    }

    @Test
    public void findRadioWithoutParametrized() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getNumberOfRadios());
    }

    @Test
    public void prevRadioStationAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindNextRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindRadioAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindRadioLessMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindRadioAboveNumbersOfRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(11);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindVolumeLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}


