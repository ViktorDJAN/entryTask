package ru.kashtanov.cards;

import ru.kashtanov.bonusProgram.BonusProgram;
import ru.kashtanov.model.CreditCard;

public class ReplenishmentBonusCreditCard extends CreditCard {
    private BonusProgram bonusProgram;

    public ReplenishmentBonusCreditCard() {
    }

    public ReplenishmentBonusCreditCard(Double creditLimit, BonusProgram bonusProgram) {
        super(creditLimit);
        this.bonusProgram = bonusProgram;
    }



    public BonusProgram getBonusProgram() {
        return bonusProgram;
    }

    public void setBonusProgram(BonusProgram bonusProgram) {
        this.bonusProgram = bonusProgram;
    }

    @Override
    public void topUpAccount(Double amount) {
        bonusProgram.collectMoneyWhenReplenishing(amount);
        super.topUpAccount(amount);
    }


    @Override
    public void getFundsInfo() {
        System.out.println("Бонусный счет: " + bonusProgram.getBonusQty());
        super.getFundsInfo();
    }
}
