package com.amp;

import org.junit.Test;

import java.security.InvalidParameterException;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Samuel on 16-02-17.
 */
public class RateCalculatorTest {
    RateCalculator rate = new RateCalculator();

    @Test
    public void invalidWeight_lessThan0()
    {
        try {
            rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                    RateCalculator.STAMP_BCP, -1);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
    }

    @Test
    public void invalidWeightGreaterThan500()
    {
        try {
            rate.getRate(RateCalculator.USA, RateCalculator.STANDARD,
                    RateCalculator.STAMP_BCP, 501);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
    }

    // testing
    @Test
    public void canada_Standard_stampBCP_UpTo30g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                RateCalculator.STAMP_BCP, 30), 0.85, 0.001);
    }

    @Test
    public void canada_Standard_stampBCP_Over30_UpTo50g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                RateCalculator.STAMP_BCP, 31), 1.20, 0.001);
    }

    @Test
    public void canada_Standard_METER_OR_POSTALINDICIA_UpTo30g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                RateCalculator.METER_OR_POSTALINDICIA, 20), 0.80, 0.001);
    }

    @Test
    public void canada_Standard_METER_OR_POSTALINDICIA_Over30_UpTo50g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                RateCalculator.METER_OR_POSTALINDICIA, 40), 1.19, 0.001);
    }


    @Test
    public void canada_Standard_SINGLESTAMP_UpTo30g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                RateCalculator.SINGLE_STAMP, 10), 1.00, 0.001);
    }

    @Test
    public void canada_Standard_SINGLESTAMP_Over30_UpTo50g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                RateCalculator.SINGLE_STAMP, 50), 1.20, 0.001);
    }

    @Test
    public void canada_OTHER_STAMP_OVER50_UpTo100g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                RateCalculator.STAMP, 51), 2.95, 0.001);
    }

    @Test
    public void canada_OTHER_STAMP_OVER100_UpTo200g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                RateCalculator.STAMP, 200), 5.15, 0.001);
    }


    @Test
    public void canada_OTHER_STAMP_OVER200_UpTo500g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                RateCalculator.STAMP, 300), 10.30, 0.001);
    }

    @Test
    public void canada_OTHER_METER_OR_POSTALINDICIA_Over50_UpTo100g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                RateCalculator.METER_OR_POSTALINDICIA, 51), 2.68, 0.001);
    }

    @Test
    public void canada_OTHER_METER_OR_POSTALINDICIA_Over100_UpTo200g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                RateCalculator.METER_OR_POSTALINDICIA, 101), 4.85, 0.001);
    }

    @Test
    public void canada_OTHER_METER_OR_POSTALINDICIA_Over200_UpTo500g()
    {
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                RateCalculator.METER_OR_POSTALINDICIA, 403), 9.69, 0.001);
    }




}
