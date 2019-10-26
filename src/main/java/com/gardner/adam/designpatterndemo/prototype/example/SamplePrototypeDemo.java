package com.gardner.adam.designpatterndemo.prototype.example;


import java.util.ArrayList;
import java.util.List;

public class SamplePrototypeDemo {

    public static void demo(){
        String sql = "select * from movies where title = ?";

        List<String> parameters = new ArrayList<>();

        parameters.add("star wars");

        Record record = new Record();

        SamplePrototype firstPrototype = new SamplePrototype(sql, parameters, record);

        System.out.println(firstPrototype.getSql());
        System.out.println(firstPrototype.getParameters());
        System.out.println(firstPrototype.getRecord());

        SamplePrototype secondPrototype = firstPrototype.clone();

        System.out.println(secondPrototype.getSql());
        System.out.println(secondPrototype.getParameters());
        System.out.println(secondPrototype.getRecord());
    }
}
