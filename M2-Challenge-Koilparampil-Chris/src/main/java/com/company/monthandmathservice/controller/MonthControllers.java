package com.company.monthandmathservice.controller;

import com.company.monthandmathservice.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MonthControllers {

    Random myRNG = new Random();
    private static List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month(1,"January"),
            new Month(2,"February"),
            new Month(3,"March"),
            new Month(4,"April"),
            new Month(5,"May"),
            new Month(6,"June"),
            new Month(7,"July"),
            new Month(8,"August"),
            new Month(9,"September"),
            new Month(10,"October"),
            new Month(11,"November"),
            new Month(12,"December")
    ));


    @GetMapping(value = "/month/{monthNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public Month getASingleMonth(@PathVariable int monthNumber) throws NoSuchFieldException {
        Month foundMonth = null;

        for (Month month :monthList){
            if (month.getNumber()==monthNumber){
                foundMonth = month;
                break;
            }
        }
        if (foundMonth == null) {
            throw new NoSuchFieldException("You're Out of Bounds");
        }
        return foundMonth;
    }

    @GetMapping(value = "/randomMonth")
    @ResponseStatus(value = HttpStatus.OK)
    public Month getARandomMonth (){
        return monthList.get(myRNG.nextInt(12));
    }









}
