package com.codebuilder.dp.factory;

public class GoldCard extends CardType {

    public GoldCard() {
        setCreditLimit();
    }

    @Override
    public void setCreditLimit() {
        creditLimit = 250000;
    }
}
