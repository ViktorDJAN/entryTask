package ru.kashtanov.cards;

import ru.kashtanov.bonusProgram.BonusProgram;
import ru.kashtanov.model.CreditCard;

public class ReplenishmentBonusCreditCard extends CreditCard {


    public ReplenishmentBonusCreditCard( Double creditLimit,BonusProgram bonusProgram) {
        super(bonusProgram, creditLimit);
    }

    @Override
    public void topUpBalance(Double amount) {
        super.getBonusProgram().collectMoneyWhenReplenishing(amount);
        super.topUpBalance(amount);
    }

    @Override
    public void getFundsInfo() {
        System.out.println("Бонусный счет: " +  super.getBonusProgram().getBonusQty());
        super.getFundsInfo();
    }

    public BonusProgram getBonusProgram() {
        return  super.getBonusProgram();
    }

}
