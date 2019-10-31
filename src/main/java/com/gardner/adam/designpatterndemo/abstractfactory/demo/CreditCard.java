package com.gardner.adam.designpatterndemo.abstractfactory.demo;

public abstract class CreditCard {

    protected int carNumberLength;

    protected int cscNumber;

    public int getCardNumberLength(){
        return carNumberLength;
    }

    public void setCarNumberLength(int carNumberLength){
        this.carNumberLength = carNumberLength;
    }

    public int getCscNumber(){
        return cscNumber;
    }

    public void setCscNumber(int cscNumber){
        this.cscNumber = cscNumber;
    }
}
