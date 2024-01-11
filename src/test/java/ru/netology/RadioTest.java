package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void turnUpTheVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);

        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void turnDownTheVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void changeToTheNextStation() {
        Radio cound = new Radio();
        cound.setCurrentRadioStation(9);

        cound.nextStation();

        int expected = 0;
        int actual = cound.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void changeToThePreviousStation() {
        Radio cound = new Radio();
        cound.setCurrentRadioStation(0);

        cound.prevStation();

        int expected = 9;
        int actual = cound.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}


