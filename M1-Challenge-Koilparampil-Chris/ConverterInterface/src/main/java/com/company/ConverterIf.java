package com.company;

import com.company.interfaces.Converter;

public class ConverterIf implements Converter {

    public String convertMonth(int i) {
        if (i == 1) {
            return "January";
        } else if (i == 2) {
            return "February";
        } else if (i == 3) {
            return "March";
        } else if (i == 4) {
            return "April";
        } else if (i == 5) {
            return "May";
        } else if (i == 6) {
            return "June";
        } else if (i == 7) {
            return "July";
        } else if (i == 8) {
            return "August";
        } else if (i == 9) {
            return "September";
        } else if (i == 10) {
            return "October";
        } else if (i == 11) {
            return "November";
        } else if (i == 12) {
            return "December";
        } else {
            return "There is an Error, you have entered something that is out of the scope of this code";
        }
    }

    public  String convertDay(int j) {
        if (j == 1) {
            return "Sunday";
        } else if (j == 2) {
            return "Monday";
        } else if (j == 3) {
            return "Tuesday";
        } else if (j == 4) {
            return "Wednesday";
        } else if (j == 5) {
            return "Thursday";
        } else if (j == 6) {
            return "Friday";
        } else if (j == 7) {
            return "Saturday";
        } else {
            return "There is an Error, you have entered something that is out of the scope of this code";
        }
    }


}


