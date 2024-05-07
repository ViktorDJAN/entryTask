package ru.kashtanov;

import ru.kashtanov.bonusProgram.BonusProgram;
import ru.kashtanov.cards.ReplenishmentBonusCreditCard;
import ru.kashtanov.cards.WithCashbackDebitCard;
import ru.kashtanov.cards.GoodsBonusDebitCard;
import ru.kashtanov.model.CreditCard;
import ru.kashtanov.model.DebitCard;

public class Main {
    public static void main(String[] args) {
        BonusProgram onePercentBonusProgram = new BonusProgram(0.01);
        DebitCard onePercentBonusDebitCard = new GoodsBonusDebitCard(onePercentBonusProgram);
        onePercentBonusDebitCard.setBalance(1000.0);
        onePercentBonusDebitCard.getFundsInfo();
        onePercentBonusDebitCard.payOff(200.0);
        onePercentBonusDebitCard.topUpBalance(300.0);
        onePercentBonusDebitCard.getFundsInfo();
        System.out.println();

        BonusProgram fivePercentBonusProgram = new BonusProgram(0.05);
        DebitCard fivePercentCashbackDebitCard = new WithCashbackDebitCard(fivePercentBonusProgram);
        fivePercentCashbackDebitCard.setBalance(7000.0);
        fivePercentCashbackDebitCard.getFundsInfo();
        fivePercentCashbackDebitCard.payOff(5050.0);
        fivePercentCashbackDebitCard.topUpBalance(1000.0);
        fivePercentCashbackDebitCard.getFundsInfo();
        System.out.println();

        BonusProgram halfPercentBonusProgram = new BonusProgram(0.005);
        CreditCard withBonusCreditCard = new ReplenishmentBonusCreditCard(10000.0, halfPercentBonusProgram);
        withBonusCreditCard.setBalance(5000.0);
        withBonusCreditCard.payOff(10000.0);
        withBonusCreditCard.getFundsInfo();
        withBonusCreditCard.topUpBalance(7000.0);
        withBonusCreditCard.getFundsInfo();

    }
}