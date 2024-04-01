package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {

    //
    // Exercise 1: Convert 27 degrees celsius to fahrenheit
    // The equation is: fahrenheit = (9 / 5) * celsius + 32
    //
    @Test
    public void convertToFarenheit() {
        double celsius = 27.0d;
        double fahrenheit = 0.0d;

        // TODO: Use a floating point calculation to calculate the fahrenheit equivalent of the celsius value.
        fahrenheit = (9.0 / 5.0) * celsius + 32;

        assertThat(fahrenheit, equalTo(80.6));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertKilogramsToPounds() {
        int weightInKilograms = 50;
        double weightInPounds = 0;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds
        double poundsToKilograms = 2.20462;

        weightInPounds = 50.0 * poundsToKilograms;

        assertThat(weightInPounds, equalTo(110.231));

    }
}
