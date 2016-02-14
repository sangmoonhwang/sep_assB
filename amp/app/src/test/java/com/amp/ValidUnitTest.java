package com.amp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ValidUnitTest {

    @Test
    public void canadaSpecialStamps() throws Exception {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp special", weight), 0.85, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp special", weight), 1.20, 0.001);
    }

    @Test
    public void canadaSingleStampsStandards() throws Exception {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp", weight), 1.00, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp", weight), 1.20, 0.001);
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

    @Test
    public void usaSingleStampsStandards() throws Exception {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("usa", "stamp", weight), 1.20, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("usa", "stamp", weight), 1.80, 0.001);
    }

    @Test
    public void usaStampsNonStandards() {
        for (int weight = 51; weight <= 100; weight++)
            assertEquals(RateCalculator.getRate("usa", "stamp", weight), 2.95, 0.001);
        for (int weight = 101; weight <= 200; weight++)
            assertEquals(RateCalculator.getRate("usa", "stamp", weight), 5.15, 0.001);
        for (int weight = 201; weight <= 500; weight++)
            assertEquals(RateCalculator.getRate("usa", "stamp", weight), 10.30, 0.001);
    }

    @Test
    public void usaMeterStandards() {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("usa", "meter", weight), 1.19, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("usa", "meter", weight), 1.72, 0.001);
    }

    @Test
    public void usaMeterNonStandards() {
        for (int weight = 51; weight <= 100; weight++)
            assertEquals(RateCalculator.getRate("usa", "meter", weight), 2.68, 0.001);
        for (int weight = 101; weight <= 200; weight++)
            assertEquals(RateCalculator.getRate("usa", "meter", weight), 4.85, 0.001);
        for (int weight = 201; weight <= 500; weight++)
            assertEquals(RateCalculator.getRate("usa", "meter", weight), 9.69, 0.001);
    }

    @Test
    public void usaPostalIndiciaStandards() {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("usa", "postal indicia", weight), 1.19, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("usa", "postal indicia", weight), 1.72, 0.001);
    }

    @Test
    public void usaPostalIndiciaNonStandards() {
        for (int weight = 51; weight <= 100; weight++)
            assertEquals(RateCalculator.getRate("usa", "postal indicia", weight), 2.68, 0.001);
        for (int weight = 101; weight <= 200; weight++)
            assertEquals(RateCalculator.getRate("usa", "postal indicia", weight), 4.85, 0.001);
        for (int weight = 201; weight <= 300; weight++)
            assertEquals(RateCalculator.getRate("usa", "postal indicia", weight), 9.69, 0.001);
    }

    @Test
    public void otherSingleStampsStandards() throws Exception {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("other", "stamp", weight), 2.50, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("other", "stamp", weight), 3.60, 0.001);
    }

    @Test
    public void otherStampsNonStandards() {
        for (int weight = 51; weight <= 100; weight++)
            assertEquals(RateCalculator.getRate("other", "stamp", weight), 5.90, 0.001);
        for (int weight = 101; weight <= 200; weight++)
            assertEquals(RateCalculator.getRate("other", "stamp", weight), 10.30, 0.001);
        for (int weight = 201; weight <= 500; weight++)
            assertEquals(RateCalculator.getRate("other", "stamp", weight), 20.60, 0.001);
    }

    @Test
    public void otherMeterStandards() {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("other", "meter", weight), 2.36, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("other", "meter", weight), 3.42, 0.001);
    }

    @Test
    public void otherMeterNonStandards() {
        for (int weight = 51; weight <= 100; weight++)
            assertEquals(RateCalculator.getRate("other", "meter", weight), 5.56, 0.001);
        for (int weight = 101; weight <= 200; weight++)
            assertEquals(RateCalculator.getRate("other", "meter", weight), 9.69, 0.001);
        for (int weight = 201; weight <= 500; weight++)
            assertEquals(RateCalculator.getRate("other", "meter", weight), 19.39, 0.001);
    }

    @Test
    public void otherPostalIndiciaStandards() {
        for (int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("other", "postal indicia", weight), 2.36, 0.001);
        for (int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("other", "postal indicia", weight), 3.42, 0.001);
    }

    @Test
    public void otherPostalIndiciaNonStandards() {
        for (int weight = 51; weight <= 100; weight++)
            assertEquals(RateCalculator.getRate("other", "postal indicia", weight), 5.56, 0.001);
        for (int weight = 101; weight <= 200; weight++)
            assertEquals(RateCalculator.getRate("other", "postal indicia", weight), 9.69, 0.001);
        for (int weight = 201; weight <= 300; weight++)
            assertEquals(RateCalculator.getRate("other", "postal indicia", weight), 19.39, 0.001);
    }
}