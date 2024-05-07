package ru.kashtanov.model;

import ru.kashtanov.model.BankCard;

import java.util.List;

public class DebitCard extends BankCard {


    @Override
    public void topUpAccount(Double amount) {
        System.out.println("Пополние на сумму: " + amount);
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
            System.out.println("Недостаточно средства для списания суммы: " + amountToPay);
            return false;
        }
    }

    @Override
    public void getBalanceInfo() {
        System.out.println("Собственные средства: " + getBalance());

    }
    @Override
    public void getFundsInfo() {
        System.out.println("Собственные средства: " + getBalance());
    }


}
