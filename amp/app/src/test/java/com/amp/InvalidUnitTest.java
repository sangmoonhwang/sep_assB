package com.amp;

import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class InvalidUnitTest {

    @Test
    public void invalidWeight() {
        try {
            RateCalculator.getRate(RateCalculator.CANADA, RateCalculator.STAMP, -1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.CANADA, RateCalculator.STAMP, 501);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.CANADA, RateCalculator.METER, -1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.CANADA, RateCalculator.METER, 501);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.CANADA, RateCalculator.STAMP_SPECIAL, 51);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
    }
}