package com.codebuilder.dp.factory;

public class Bank {
    public static void main(String[] args) {
        CardType myCard = Factory.getCard("Platinum");
        System.out.println(myCard.creditLimit);
    }
}
