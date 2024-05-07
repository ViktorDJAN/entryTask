package ru.kashtanov.cards;

import ru.kashtanov.bonusProgram.BonusProgram;
import ru.kashtanov.model.DebitCard;

public class GoodsBonusDebitCard extends DebitCard  {
    private BonusProgram bonusProgram;

    public GoodsBonusDebitCard() {
    }

    public GoodsBonusDebitCard(BonusProgram bonusProgram) {
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
        bonusProgram.getPercentOfEachPurchase(amountToPay);
        return super.payOff(amountToPay);
    }



    @Override
    public void getFundsInfo() {
        System.out.println("Бонусный баланс: "+ bonusProgram.getBonusQty());
        super.getFundsInfo();
    }
}
