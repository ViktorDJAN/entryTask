package ru.kashtanov.model;

import ru.kashtanov.bonusProgram.BonusProgram;

public class DebitCard extends BankCard {

    public DebitCard(BonusProgram bonusProgram) {
        super(bonusProgram);
    }

    @Override
    public void topUpBalance(Double amount) {
        System.out.println("Пополнение на сумму: " + amount);
        Double total = getBalance() + amount;
        setBalance(total);
    }

    @Override
    public boolean payOff(Double amountToPay) {
        if (amountToPay < getBalance()) {
            setBalance(getBalance() - amountToPay);
            System.out.println("Списание средств на сумму успешно выполнено: " + amountToPay);
            return true;
        } else {
            System.out.println("Недостаточно средств для списания суммы: " + amountToPay);
            return false;
        }
    }

    @Override
    public void getBalanceInfo() {
        System.out.println("Собственные средства: " + getBalance());
    }

    @Override
    public void getFundsInfo() {
        getBalanceInfo();
    }
}