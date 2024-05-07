package ru.kashtanov.cards;

import ru.kashtanov.bonusProgram.BonusProgram;
import ru.kashtanov.model.DebitCard;

public class GoodsBonusDebitCard extends DebitCard {

    public GoodsBonusDebitCard(BonusProgram bonusProgram) {
        super(bonusProgram);
    }

    @Override
    public boolean payOff(Double amountToPay) {

        super.getBonusProgram().getPercentOfEachPurchase(amountToPay);
        return super.payOff(amountToPay);
    }

    @Override
    public void getFundsInfo() {
        System.out.println("Бонусный баланс: " +  super.getBonusProgram().getBonusQty());
        super.getFundsInfo();
    }

    public BonusProgram getBonusProgram() {
        return  super.getBonusProgram();
    }


}
