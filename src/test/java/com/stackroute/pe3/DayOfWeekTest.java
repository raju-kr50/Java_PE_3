package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfWeekTest {
    DayOfWeek dayOfWeek;

    @Before
    public void setUp() throws Exception {
        this.dayOfWeek = new DayOfWeek();
    }

    @After
    public void tearDown() throws Exception {
        this.dayOfWeek = null;
    }

    @Test
    public void givenFirstDayOfWeekShouldReturnMonday() {
        String actualResult = dayOfWeek.checkDayOfWeek("22/07/2019");
        assertEquals("Mon 22/07/2019\nSun 28/07/2019", actualResult);
    }

    @Test
    public void givenFirstDayOfWeekShouldReturnNotNull() {
        String actualResult = dayOfWeek.checkDayOfWeek("22/07/2019");
        assertNotNull(actualResult);
    }

    @Test
    public void givenNullShouldReturnNotNull() {
        String actualResult = dayOfWeek.checkDayOfWeek("22/07/2019");
        assertNotNull(null, actualResult);
    }
}