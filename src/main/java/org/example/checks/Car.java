package org.example.checks;

import java.util.Date;

public class Car {
    private static String make; // class data
    private Date year; // instance data

    public Car(String make, Date year) {
        this.make = make;
        this.year = year;
    }

    // class method
    public static String getMake() {
        return make;
    }

    // instance method
    public Date getYear() {
        return year;
    }

}
