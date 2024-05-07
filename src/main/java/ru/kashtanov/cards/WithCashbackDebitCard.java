package ru.kashtanov.cards;

import ru.kashtanov.bonusProgram.BonusProgram;
import ru.kashtanov.model.DebitCard;

public class WithCashbackDebitCard extends DebitCard {
    private BonusProgram bonusProgram;

    public WithCashbackDebitCard() {
    }

    public WithCashbackDebitCard(BonusProgram bonusProgram) {
        this.bonusProgram = bonusProgram;
    }

    public BonusProgram getBonusProgram() {
        return bonusProgram;
    }

    public void setBonusProgram(BonusProgram bonusProgram) {
        this.bonusProgram = bonusProgram;
    }

    @Override
    public boolean payOff(Double amountToPay) {
        Double cashback = bonusProgram.getCashBackWhenSpending(amountToPay);
        System.out.println("Кэшбэк при оплате составляет: " + cashback);
        setBalance(getBalance() + cashback);
        return super.payOff(amountToPay);
    }

    @Override
    public void getFundsInfo() {
        super.getFundsInfo();
    }
}
