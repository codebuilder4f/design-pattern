package com.codebuilder.dp.factory;

public class PlatinumCard extends CardType {

    public PlatinumCard() {
        setCreditLimit();
    }

    @Override
    public void setCreditLimit() {
        creditLimit = 500000;
    }
}
