package ru.kashtanov;

import ru.kashtanov.bonusProgram.BonusProgram;
import ru.kashtanov.cards.ReplenishmentBonusCreditCard;
import ru.kashtanov.cards.WithCashbackDebitCard;
import ru.kashtanov.cards.GoodsBonusDebitCard;
import ru.kashtanov.model.CreditCard;
import ru.kashtanov.model.DebitCard;

public class Main {
    public static void main(String[] args) {
        BonusProgram bonusProgram1 = new BonusProgram(0.01);
        DebitCard goodsBonusDebitCard = new GoodsBonusDebitCard(bonusProgram1);
        goodsBonusDebitCard.setBalance(1000.0);
        goodsBonusDebitCard.getFundsInfo();
        goodsBonusDebitCard.payOff(200.0);
        goodsBonusDebitCard.topUpAccount(300.0);
        goodsBonusDebitCard.getFundsInfo();
        System.out.println();

        BonusProgram bonusProgram2 = new BonusProgram(0.05);
        DebitCard cashbackDebitCard = new WithCashbackDebitCard(bonusProgram2);
        cashbackDebitCard.setBalance(7000.0);
        cashbackDebitCard.getFundsInfo();
        cashbackDebitCard.payOff(5050.0);
        cashbackDebitCard.topUpAccount(1000.0);
        cashbackDebitCard.getFundsInfo();
        System.out.println();

        BonusProgram bonusProgram3 = new BonusProgram(0.005);
        CreditCard withBonusCreditCard = new ReplenishmentBonusCreditCard(10_000.0,bonusProgram3);
        withBonusCreditCard.setBalance(5000.0);
        withBonusCreditCard.payOff(10_000.0);
        withBonusCreditCard.getFundsInfo();
        withBonusCreditCard.topUpAccount(7000.0);
        withBonusCreditCard.getFundsInfo();

    }
}