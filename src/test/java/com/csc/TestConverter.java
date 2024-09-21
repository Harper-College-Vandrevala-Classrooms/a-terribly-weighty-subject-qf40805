package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestConverter {

    Converter converter;

    @BeforeEach
    void setUp() {
        converter = new Converter();
    }

    @Test
    public void testZeroOuncesToPounds() {
        assertEquals("0.0000 lbs", converter.toPounds(0));
    }

    @Test
    public void test1OunceToPounds() {
        assertEquals("0.0625 lbs", converter.toPounds(1));
    }

    @Test
    public void test2OuncesToPounds() {
        assertEquals("0.1250 lbs", converter.toPounds(2));
    }

    @Test
    public void test16OuncesToPounds() {
        assertEquals("1.0000 lbs", converter.toPounds(16));
    }

    @Test
    public void test24OuncesToPounds() {
        assertEquals("1.5000 lbs", converter.toPounds(24));
    }

    @Test
    public void test32OuncesToPounds() {
        assertEquals("2.0000 lbs", converter.toPounds(32));
    }

    @Test
    public void testZeroOuncesToPoundsAndOunces() {
        assertEquals("0 lbs 0 oz", converter.toPoundsAndOunces(0));
    }

    @Test
    public void test1OunceToPoundsAndOunces() {
        assertEquals("0 lbs 1 oz", converter.toPoundsAndOunces(1));
    }

    @Test
    public void test2OuncesToPoundsAndOunces() {
        assertEquals("0 lbs 2 oz", converter.toPoundsAndOunces(2));
    }

    @Test
    public void test16OuncesToPoundsAndOunces() {
        assertEquals("1 lb 0 oz", converter.toPoundsAndOunces(16));
    }

    @Test
    public void test24OuncesToPoundsAndOunces() {
        assertEquals("1 lb 8 oz", converter.toPoundsAndOunces(24));
    }

    @Test
    public void test32OuncesToPoundsAndOunces() {
        assertEquals("2 lbs 0 oz", converter.toPoundsAndOunces(32));
    }
}
