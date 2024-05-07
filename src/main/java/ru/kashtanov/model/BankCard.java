package ru.kashtanov.model;

import ru.kashtanov.bonusProgram.BonusProgram;

public abstract class BankCard {

    private Double balance = 0d;
    private final BonusProgram bonusProgram;

    public BankCard(BonusProgram bonusProgram) {
        this.bonusProgram = bonusProgram;
    }

    public abstract void topUpBalance(Double amount);

    public abstract boolean payOff(Double amountToPay);

    public abstract void getBalanceInfo();

    public abstract void getFundsInfo();

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public BonusProgram getBonusProgram() {
        return bonusProgram;
    }
}
