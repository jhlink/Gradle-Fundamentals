package com.example.android.clickcounter.test;

import android.os.Parcel;

import com.example.android.clickcounter.ClickCounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClickCounterTest {

    private ClickCounter clickCounter;

    @Before
    public void setUp() throws Exception {
        clickCounter = new ClickCounter();
    }

    @Test
    public void increment() {
        clickCounter.increment();
        assert clickCounter.getCount() == 1;
    }


    @Test
    public void checkIfInitializedObjectCountIsZero() {
        assert clickCounter.getCount() == 0;
    }

    @Test
    public void getCount() {
        clickCounter.increment();
        clickCounter.increment();
        clickCounter.increment();
        clickCounter.increment();

        assert clickCounter.getCount() == 4;

    }
}