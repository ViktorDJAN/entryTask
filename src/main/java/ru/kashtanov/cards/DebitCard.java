package ru.kashtanov.cards;

import ru.kashtanov.model.BankCard;

import java.util.List;

public class DebitCard extends BankCard {

    @Override
    public void topUpAccount(Double amount) {
        System.out.println("The Debit card with balance: " + getBalance() + " is replenished on sum: " + amount);
        Double total = getBalance() + amount;
        setBalance(total);
    }

    @Override
    public boolean payOff(Double amountToPay) {
        return false;
    }

    @Override
    public void getBalanceInfo() {

    }

    @Override
    public List<? extends BankCard> getFundsInfo() {
        return null;
    }

}
