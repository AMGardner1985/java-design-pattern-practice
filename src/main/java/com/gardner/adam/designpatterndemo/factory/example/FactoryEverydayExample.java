package com.gardner.adam.designpatterndemo.factory.example;

import java.util.Calendar;

public class FactoryEverydayExample {

    public static void main(String args []){
        Calendar cal = Calendar.getInstance();
        
        System.out.println(cal); // see what type of cal returned
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
