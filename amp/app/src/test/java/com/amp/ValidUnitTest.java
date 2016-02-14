package com.amp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ValidUnitTest {

    @Test
    public void canadaSingleStampsStandards() throws Exception {
        for(int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp", weight), 1.00, 0.001);
        for(int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp", weight), 1.20, 0.001);
    }
    @Test
    public void canadaSpecialStamps() throws Exception {
        for(int weight = 0; weight <= 30; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp special", weight), 0.85, 0.001);
        for(int weight = 31; weight <= 50; weight++)
            assertEquals(RateCalculator.getRate("canada", "stamp special", weight), 1.20, 0.001);
    }
}