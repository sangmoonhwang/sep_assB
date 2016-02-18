package com.amp;

import java.security.InvalidParameterException;

/**
 * Created by sangmoon on 2016-02-14.
 */
public class RateCalculator {
    // territories
    public static final String CANADA = "Canada";
    public static final String USA = "USA";
    public static final String INTERNATIONAL = "International";

    // type
    public static final String STANDARD = "standard";
    public static final String OTHER = "stamp"; // non standard and oversize
    public static final String LETTER_POST = "letter-post";

    // items
    public static final String STAMP_BCP = "stamps in booklets/coils/panes "; //Stamps in booklets/coils/panes
    public static final String STAMP = "stamp(s)";
    public static final String METER_OR_POSTALINDICIA = "meter";
    public static final String SINGLE_STAMP = "single stamp";

    public static final String WEIGHT_EXCEPTION = "weight is out of range";
    public static final String TYPE_EXCEPTION = "invalid type";


    // compute the rate
    public double getRate(String country_destination, String type, String item, double weight) {

        // weight must be greater than 0 or less or equal to 500
        // otherwise return an exception
        if (weight >= 500 || weight < 0) {
            throw new InvalidParameterException(WEIGHT_EXCEPTION);
        }


        if (country_destination.equals(CANADA)) {
            if (type.equals(STANDARD)) {
                    switch (item) {
                        case STAMP_BCP:
                            // Canada, standard, Stamps in booklets/coils/panes, Up to 30 g
                            if (weight > 0 && weight <= 30) return 0.85;
                            // over 30, up to 50
                            else if(weight > 30 && weight <= 50) return 1.20;
                            // case of meter or postal Indicia
                        case METER_OR_POSTALINDICIA:
                            // up to 30 g
                            if (weight > 0 && weight <= 30) return 0.80;

                            // over 30 up to 50
                            else if(weight > 30 && weight <= 50) return 1.19;
                            // case sinple stamp
                        case SINGLE_STAMP:
                            // up to 30
                            if (weight > 0 && weight <= 30) return 1.00;
                            //over 30, up to 50
                            else if(weight > 30 && weight <= 50) return 1.20;
                    }
            }

            // if Other (non standard, oversize)
            else{

                switch (item){
                    // stamp
                    case STAMP:
                        // greater than 50, less or equal to 100
                        if (weight > 50 && weight <= 100) return 2.95;
                            // greater than 100, less or equal to 200
                        else if (weight > 100 && weight <= 200) return 5.15;
                            // greater than 200, up to 500
                        else if (weight > 200 && weight <= 500) return 10.30;
                        //case meter or postal indicia
                    case METER_OR_POSTALINDICIA:
                        // over 50 up to 100
                        if (weight > 50 && weight <= 100) return 2.68;
                            // greater than 100, less or equal to 200
                        else if (weight > 100 && weight <= 200) return 4.85;
                            // greater than 200, up to 500
                        else if (weight > 200 && weight <= 500) return 9.69;
                }

            }
        }
        return 0.0;
    }

}




























    /*
        if (weight > 500 || weight < 0) {
            throw new InvalidParameterException(WEIGHT_EXCEPTION);
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
                        throw new InvalidParameterException(WEIGHT_EXCEPTION);
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
                    throw new InvalidParameterException(TYPE_EXCEPTION);
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
                    throw new InvalidParameterException(TYPE_EXCEPTION);
            }
        } else {//International
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
                    throw new InvalidParameterException(TYPE_EXCEPTION);
            }
        }
        throw new RuntimeException("Weird error");
    }
    */


