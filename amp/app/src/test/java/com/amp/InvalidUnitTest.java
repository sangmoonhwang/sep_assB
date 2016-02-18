package com.amp;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class InvalidUnitTest {
    static final String INVALID_TYPE = "invalidType";

    /*@Test
    public void invalidWeight() {
        try {
            RateCalculator.getRate(RateCalculator.USA, RateCalculator.STAMP, -1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.USA, RateCalculator.STAMP, 501);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.USA, RateCalculator.METER, -1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.USA, RateCalculator.METER, 501);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.USA, RateCalculator.POSTAL_INDICIA, -1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.USA, RateCalculator.POSTAL_INDICIA, 501);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.INTERNATIONAL, RateCalculator.STAMP, -1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.INTERNATIONAL, RateCalculator.STAMP, 501);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.INTERNATIONAL, RateCalculator.METER, -1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.INTERNATIONAL, RateCalculator.METER, 501);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.INTERNATIONAL, RateCalculator.POSTAL_INDICIA, -1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.INTERNATIONAL, RateCalculator.POSTAL_INDICIA, 501);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
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
            RateCalculator.getRate(RateCalculator.CANADA, RateCalculator.POSTAL_INDICIA, -1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.CANADA, RateCalculator.POSTAL_INDICIA, 501);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.CANADA, RateCalculator.STAMP_SPECIAL, 51);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
    }

   /* @Test
    public void invalidType() {
        try {
            RateCalculator.getRate(RateCalculator.CANADA, INVALID_TYPE, 1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.TYPE_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.USA, INVALID_TYPE, 1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.TYPE_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.INTERNATIONAL, INVALID_TYPE, 1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.TYPE_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.USA, RateCalculator.STAMP_SPECIAL, 1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.TYPE_EXCEPTION);
        }
        try {
            RateCalculator.getRate(RateCalculator.INTERNATIONAL, RateCalculator.STAMP_SPECIAL, 1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.TYPE_EXCEPTION);
        }
    }*/
}