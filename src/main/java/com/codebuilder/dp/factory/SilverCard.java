package com.codebuilder.dp.factory;

public class SilverCard extends CardType{

    double creditLimit;
    public SilverCard() {
        setCreditLimit();
    }

    @Override
    public void setCreditLimit() {
        creditLimit=100000;
    }
}
