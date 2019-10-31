package com.gardner.adam.designpatterndemo.abstractfactory.demo;

public class AmexPlatinumValidator extends Validator {

    @Override
    public boolean isValid(CreditCard creditCard){
        return false;
    }
}
