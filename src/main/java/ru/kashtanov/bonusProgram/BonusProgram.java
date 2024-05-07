package ru.kashtanov.bonusProgram;

public class BonusProgram implements BonusProgramKinds {
    private Double percent;
    private Double bonusQty = (double) 0;

    public BonusProgram() {
    }

    public BonusProgram(Double percent) {
        this.percent = percent;

    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double getBonusQty() {
        return bonusQty;
    }

    public void setBonusQty(Double bonusQty) {
        this.bonusQty = bonusQty;
    }

    @Override
    public void getPercentOfEachPurchase(Double spentMoney) {
        bonusQty += spentMoney * percent;
    }

    @Override
    public Double getCashBackWhenSpending(Double spentMoney) {
        Double cashBack = 0.0;
        if (spentMoney >= 5000) {
            cashBack += spentMoney * percent;
        }
        return cashBack;
    }

    @Override
    public Double collectMoneyWhenReplenishing(Double replenishedMoney) {
        bonusQty += replenishedMoney * percent;
        return bonusQty;
    }
}
