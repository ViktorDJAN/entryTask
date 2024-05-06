package ru.kashtanov;

import ru.kashtanov.cards.CreditCard;
import ru.kashtanov.cards.DebitCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1000.0, 800.0);
        creditCard.topUpAccount(400.0);
        System.out.println(creditCard + " current balance = " + creditCard.getBalance());
        creditCard.payOff(1300.0);
        System.out.println(creditCard + " current balance = " + creditCard.getBalance());


    }
}