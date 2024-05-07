package ru.kashtanov.cards;

import ru.kashtanov.bonusProgram.BonusProgram;
import ru.kashtanov.model.DebitCard;

public class WithCashbackDebitCard extends DebitCard {

    public WithCashbackDebitCard(BonusProgram bonusProgram) {
        super(bonusProgram);
    }

    @Override
    public boolean payOff(Double amountToPay) {
        Double cashback =  super.getBonusProgram().getCashBackWhenSpending(amountToPay);
        System.out.println("Кэшбэк при оплате составляет: " + cashback);
        setBalance(getBalance() + cashback);
        return super.payOff(amountToPay);
    }

    public BonusProgram getBonusProgram() {
        return  super.getBonusProgram();
    }

}

