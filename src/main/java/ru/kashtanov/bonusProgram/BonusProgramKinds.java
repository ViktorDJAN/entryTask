package ru.kashtanov.bonusProgram;

public interface BonusProgramKinds {

    void getPercentOfEachPurchase(Double spentMoney);
    Double getCashBackWhenSpending(Double spentMoney);
    Double collectMoneyWhenReplenishing(Double replenishedMoney);
}
