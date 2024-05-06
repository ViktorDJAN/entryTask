package ru.kashtanov.model;

import java.util.List;

public abstract class BankCard {
    private Double balance = (double) 0;


    public abstract void topUpAccount(Double amount);
    public abstract boolean payOff(Double amountToPay);
    public abstract void getBalanceInfo();
    public abstract List<? extends BankCard> getFundsInfo();

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
