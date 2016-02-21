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
        for(int i = 1; i <=30; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                    RateCalculator.STAMP_BCP, i), 0.85, 0.001);
        }
    }

    @Test
    public void canada_Standard_stampBCP_Over30_UpTo50g()
    {
        for(int i = 31; i <=50; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                    RateCalculator.STAMP_BCP, i), 1.20, 0.001);
        }
    }

    @Test
    public void canada_Standard_METER_OR_POSTALINDICIA_UpTo30g()
    {
        for(int i = 1; i <=30; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 0.80, 0.001);
        }
    }

    @Test
    public void canada_Standard_METER_OR_POSTALINDICIA_Over30_UpTo50g()
    {
        for(int i = 31; i <=50; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 1.19, 0.001);
        }
    }


    @Test
    public void canada_Standard_SINGLESTAMP_UpTo30g()
    {
        for(int i = 1; i <=30; i++){
        assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                RateCalculator.SINGLE_STAMP, i), 1.00, 0.001);
        }
    }

    @Test
    public void canada_Standard_SINGLESTAMP_Over30_UpTo50g()
    {
        for(int i = 31; i <=50; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.STANDARD,
                    RateCalculator.SINGLE_STAMP, i), 1.20, 0.001);
        }
    }

    @Test
    public void canada_OTHER_STAMP_OVER50_UpTo100g()
    {
        for(int i = 51; i <=100; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                    RateCalculator.STAMP, i), 1.80, 0.001);
        }
    }

    @Test
    public void canada_OTHER_STAMP_OVER100_UpTo200g()
    {
        for(int i = 101; i <=200; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                    RateCalculator.STAMP, i), 2.95, 0.001);
        }
    }

    @Test
    public void canada_OTHER_STAMP_OVER200_UpTo300g()
    {
        for(int i = 201; i <=300; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                    RateCalculator.STAMP, i), 4.10, 0.001);
        }
    }

    @Test
    public void canada_OTHER_STAMP_OVER300_UpTo400g()
    {
        for(int i = 301; i <=400; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                    RateCalculator.STAMP, i), 4.70, 0.001);
        }
    }

    @Test
    public void canada_OTHER_STAMP_OVER400_UpTo500g()
    {
        for(int i = 401; i <=500; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                    RateCalculator.STAMP, i), 5.05, 0.001);
        }
    }

    @Test
    public void canada_OTHER_METER_OR_POSTALINDICIA_OVER50_UpTo100g()
    {
        for(int i = 51; i <=100; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 1.71, 0.001);
        }
    }

    @Test
    public void canada_OTHER_METER_OR_POSTALINDICIA_OVER100_UpTo200g()
    {
        for(int i = 101; i <=200; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 2.77, 0.001);
        }
    }

    @Test
    public void canada_OTHER_METER_OR_POSTALINDICIA_OVER200_UpTo300g()
    {
        for(int i = 201; i <=300; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 3.89, 0.001);
        }
    }

    @Test
    public void canada_OTHER_METER_OR_POSTALINDICIA_OVER300_UpTo400g()
    {
        for(int i = 301; i <=400; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 4.42, 0.001);
        }
    }

    @Test
    public void canada_OTHER_METER_OR_POSTALINDICIA_OVER400_UpTo500g()
    {
        for(int i = 401; i <=500; i++) {
            assertEquals(rate.getRate(RateCalculator.CANADA, RateCalculator.OTHER,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 4.74, 0.001);
        }
    }

    @Test
    public void usa_LetterPost_stamp_UpTo30g()
    {
        for(int i = 1; i <=30; i++) {
            assertEquals(rate.getRate(RateCalculator.USA, RateCalculator.LETTER_POST,
                    RateCalculator.STAMP, i), 1.20, 0.001);
        }
    }

    @Test
    public void usa_LetterPost_stamp_Over30_UpTo50g()
    {
        for(int i = 31; i <=50; i++) {
            assertEquals(rate.getRate(RateCalculator.USA, RateCalculator.LETTER_POST,
                    RateCalculator.STAMP, i), 1.80, 0.001);
        }
    }


    @Test
    public void usa_LetterPost_stamp_Over50_INVALID()
    {
        try {
            rate.getRate(RateCalculator.USA, RateCalculator.LETTER_POST,
                    RateCalculator.STAMP, 51);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
    }

    @Test
    public void usa_LetterPost_METER_OR_POSTALINDICIA_UpTo30()
    {
        for(int i = 1; i <=30; i++) {
            assertEquals(rate.getRate(RateCalculator.USA, RateCalculator.LETTER_POST,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 1.19, 0.001);
        }
    }

    @Test
    public void usa_LetterPost_METER_OR_POSTALINDICIA_Over30_UpTo50()
    {
        for(int i = 31; i <=50; i++) {
            assertEquals(rate.getRate(RateCalculator.USA, RateCalculator.LETTER_POST,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 1.72, 0.001);
        }
    }

    public void usa_LetterPost_METER_OR_POSTALINDICIA_Over50_INVALID()
    {
        try {
            rate.getRate(RateCalculator.USA, RateCalculator.LETTER_POST,
                    RateCalculator.METER_OR_POSTALINDICIA, 51);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), RateCalculator.WEIGHT_EXCEPTION);
        }
    }






    @Test
    public void usa_OTHER_STAMP_OVER50_UpTo100g()
    {
        for(int i = 51; i <=100; i++) {
            assertEquals(rate.getRate(RateCalculator.USA, RateCalculator.OTHER,
                    RateCalculator.STAMP, i), 2.95, 0.001);
        }
    }


    @Test
    public void usa_OTHER_STAMP_OVER100_UpTo200g()
    {
        for(int i = 101; i <=200; i++) {
            assertEquals(rate.getRate(RateCalculator.USA, RateCalculator.OTHER,
                    RateCalculator.STAMP, i), 5.15, 0.001);
        }
    }

    @Test
    public void usa_OTHER_STAMP_OVER200_UpTo500g()
    {
        for(int i = 201; i <=500; i++) {
            assertEquals(rate.getRate(RateCalculator.USA, RateCalculator.OTHER,
                    RateCalculator.STAMP, i), 10.30, 0.001);
        }
    }

    @Test
    public void usa_OTHER_METER_OR_POSTALINDICIA_Over50_UpTo100g()
    {
        for(int i = 51; i <=100; i++)
            assertEquals(rate.getRate(RateCalculator.USA, RateCalculator.OTHER,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 2.68, 0.001);
    }

    @Test
    public void usa_OTHER_METER_OR_POSTALINDICIA_Over100_UpTo200g()
    {
        for(int i = 101; i <=200; i++) {
            assertEquals(rate.getRate(RateCalculator.USA, RateCalculator.OTHER,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 4.85, 0.001);
        }
    }


    @Test
    public void usa_OTHER_METER_OR_POSTALINDICIA_Over200_UpTo500g()
    {
        for(int i = 201; i <=500; i++) {
            assertEquals(rate.getRate(RateCalculator.USA, RateCalculator.OTHER,
                    RateCalculator.METER_OR_POSTALINDICIA, i), 9.69, 0.001);
        }
    }

}
