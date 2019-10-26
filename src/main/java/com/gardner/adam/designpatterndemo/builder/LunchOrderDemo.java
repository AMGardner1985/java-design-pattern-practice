package com.gardner.adam.designpatterndemo.builder;

public class LunchOrderDemo {

    public void lunchOrderdemo(){
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("wheat").condiments("lettuce").dressing("mayo").meat("turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getMeat());
        System.out.println(lunchOrder.getDressing());

    }
}
