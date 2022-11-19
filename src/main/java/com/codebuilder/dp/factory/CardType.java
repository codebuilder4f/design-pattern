package com.codebuilder.dp.factory;

import lombok.ToString;

@ToString
public abstract class CardType {

    protected double creditLimit;

    public abstract void setCreditLimit();

}
