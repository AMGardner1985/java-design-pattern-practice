package com.gardner.adam.designpatterndemo.abstractfactory.demo;

public class AmexGoldValidator extends Validator {

    @Override
    public boolean isValid(CreditCard creditCard){
        return false;
    }
}
