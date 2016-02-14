package com.amp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ValidUnitTest {

    @Test
    public void canadaSingleStampsStandards() throws Exception {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp", weight), 1.00, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp", weight), 1.20, 0.001);
    }

    @Test
    public void canadaSpecialStamps() throws Exception {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp special", weight), 0.85, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp special", weight), 1.20, 0.001);
    }

    @Test
    public void canadaStampsNonStandards() {
        for (int weight = 401; weight <= 500; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp", weight), 5.05, 0.001);
        for (int weight = 301; weight <= 400; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp", weight), 4.70, 0.001);
        for (int weight = 51; weight <= 100; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp", weight), 1.80, 0.001);
        for (int weight = 101; weight <= 200; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp", weight), 2.95, 0.001);
        for (int weight = 201; weight <= 300; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp", weight), 4.10, 0.001);
    }

    @Test
    public void canadaMeterStandards() {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("canada", "meter", weight), 0.80, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("canada", "meter", weight), 1.19, 0.001);
    }

    @Test
    public void canadaMeterNonStandards() {
        for (int weight = 401; weight <= 500; weight++)
            assertEquals(RateCalculator.getRate("canada", "meter", weight), 4.74, 0.001);
        for (int weight = 301; weight <= 400; weight++)
            assertEquals(RateCalculator.getRate("canada", "meter", weight), 4.42, 0.001);
        for (int weight = 51; weight <= 100; weight++)
            assertEquals(RateCalculator.getRate("canada", "meter", weight), 1.71, 0.001);
        for (int weight = 101; weight <= 200; weight++)
            assertEquals(RateCalculator.getRate("canada", "meter", weight), 2.77, 0.001);
        for (int weight = 201; weight <= 300; weight++)
            assertEquals(RateCalculator.getRate("canada", "meter", weight), 3.89, 0.001);
    }

    @Test
    public void canadaPostalIndiciaStandards() {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("canada", "postal indicia", weight), 0.80, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("canada", "postal indicia", weight), 1.19, 0.001);
    }

    @Test
    public void canadaPostalIndiciaNonStandards() {
        for (int weight = 401; weight <= 500; weight++)
            assertEquals(RateCalculator.getRate("canada", "postal indicia", weight), 4.74, 0.001);
        for (int weight = 301; weight <= 400; weight++)
            assertEquals(RateCalculator.getRate("canada", "postal indicia", weight), 4.42, 0.001);
        for (int weight = 51; weight <= 100; weight++)
            assertEquals(RateCalculator.getRate("canada", "postal indicia", weight), 1.71, 0.001);
        for (int weight = 101; weight <= 200; weight++)
            assertEquals(RateCalculator.getRate("canada", "postal indicia", weight), 2.77, 0.001);
        for (int weight = 201; weight <= 300; weight++)
            assertEquals(RateCalculator.getRate("canada", "postal indicia", weight), 3.89, 0.001);
    }
}