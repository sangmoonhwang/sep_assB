package com.amp;

import java.security.InvalidParameterException;

/**
 * Created by sangmoon on 2016-02-14.
 */
public class RateCalculator {
    public static final String CANADA = "canada";
    public static final String USA = "united state";
    public static final String STAMP_SPECIAL = "stamp special";
    public static final String STAMP = "stamp";
    public static final String METER = "meter";
    public static final String POSTAL_INDICIA = "postal indicia";


    public static double getRate(String nation, String type, double weight) {
        if (weight > 500 || weight < 0) {
            throw new InvalidParameterException("weight is out of range");
        }
        if (nation.toLowerCase().equals(CANADA)) {
            switch (type.toLowerCase()) {
                case STAMP:
                    if (weight <= 30)
                        return 1.00;
                    if (weight <= 50)
                        return 1.20;
                    if (weight <= 100)
                        return 1.80;
                    if (weight <= 200)
                        return 2.95;
                    if (weight <= 300)
                        return 4.10;
                    if (weight <= 400)
                        return 4.70;
                    if (weight <= 500)
                        return 5.05;
                    break;
                case STAMP_SPECIAL:
                    if (weight <= 30)
                        return 0.85;
                    if (weight <= 50)
                        return 1.20;
                    else
                        throw new InvalidParameterException("weight is out of range for special stamps");
                case METER:
                    if (weight <= 30)
                        return 0.80;
                    if (weight <= 50)
                        return 1.19;
                    if (weight <= 100)
                        return 1.71;
                    if (weight <= 200)
                        return 2.77;
                    if (weight <= 300)
                        return 3.89;
                    if (weight <= 400)
                        return 4.42;
                    if (weight <= 500)
                        return 4.74;
                    break;
                case POSTAL_INDICIA:
                    if (weight <= 30)
                        return 0.80;
                    if (weight <= 50)
                        return 1.19;
                    if (weight <= 100)
                        return 1.71;
                    if (weight <= 200)
                        return 2.77;
                    if (weight <= 300)
                        return 3.89;
                    if (weight <= 400)
                        return 4.42;
                    if (weight <= 500)
                        return 4.74;
                    break;
                default:
                    throw new InvalidParameterException("invalid type");
            }
        } else if (nation.toLowerCase().equals(USA)) {
            switch (type.toLowerCase()) {
                case STAMP:
                    if (weight <= 30)
                        return 1.20;
                    if (weight <= 50)
                        return 1.80;
                    if (weight <= 100)
                        return 2.95;
                    if (weight <= 200)
                        return 5.15;
                    if (weight <= 500)
                        return 10.30;
                    break;
                case METER:
                    if (weight <= 30)
                        return 1.19;
                    if (weight <= 50)
                        return 1.72;
                    if (weight <= 100)
                        return 2.68;
                    if (weight <= 200)
                        return 4.85;
                    if (weight <= 500)
                        return 9.69;
                    break;
                case POSTAL_INDICIA:
                    if (weight <= 30)
                        return 1.19;
                    if (weight <= 50)
                        return 1.72;
                    if (weight <= 100)
                        return 2.68;
                    if (weight <= 200)
                        return 4.85;
                    if (weight <= 500)
                        return 9.69;
                    break;
                default:
                    throw new InvalidParameterException("invalid type");
            }
        } else {
            switch (type.toLowerCase()) {
                case STAMP:
                    if (weight <= 30)
                        return 2.50;
                    if (weight <= 50)
                        return 3.60;
                    if (weight <= 100)
                        return 5.90;
                    if (weight <= 200)
                        return 10.30;
                    if (weight <= 500)
                        return 20.60;
                    break;
                case METER:
                    if (weight <= 30)
                        return 2.36;
                    if (weight <= 50)
                        return 3.42;
                    if (weight <= 100)
                        return 5.56;
                    if (weight <= 200)
                        return 9.69;
                    if (weight <= 500)
                        return 19.39;
                    break;
                case POSTAL_INDICIA:
                    if (weight <= 30)
                        return 2.36;
                    if (weight <= 50)
                        return 3.42;
                    if (weight <= 100)
                        return 5.56;
                    if (weight <= 200)
                        return 9.69;
                    if (weight <= 500)
                        return 19.39;
                    break;
                default:
                    throw new InvalidParameterException("invalid type");
            }
        }
        throw new RuntimeException("Weird error");
    }
}
