package com.gardner.adam.designpatterndemo.builder;

public class StringBuilderDemo {

    public static void demoOfStringBuilder(){
        StringBuilder builder = new StringBuilder();

        builder.append("This is an example");

        builder.append("of the builder pattern");

        builder.append("it has methods to append almost anything ");

        builder.append(42);

        System.out.println(builder.toString());

    }
}
