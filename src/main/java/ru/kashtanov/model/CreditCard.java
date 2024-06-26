package ru.kashtanov.model;

import ru.kashtanov.bonusProgram.BonusProgram;

public class CreditCard extends BankCard {

    private Double creditLimit;
    private Double creditPart;

    public CreditCard(BonusProgram bonusProgram, Double creditLimit) {
        super(bonusProgram);
        this.creditLimit = creditLimit;
        this.creditPart = creditLimit;
    }

    @Override
    public void topUpBalance(Double amount) {
        if (creditPart.equals(creditLimit)) {
            setBalance(getBalance() + amount);
        } else if (creditPart < creditLimit) {
            creditPart += amount;
        }
        if (creditPart > creditLimit) {
            Double difference = creditPart - creditLimit;
            setBalance(getBalance() + difference);
            creditPart -= difference;
        }
    }

    @Override
    public boolean payOff(Double amountToPay) {
        if (getBalance() + creditPart < amountToPay) {
            System.out.println("Недостаточно средства для списания суммы: " + amountToPay);
            return false;
        }
        if (getBalance() - amountToPay > 0) {
            setBalance(getBalance() - amountToPay);
        } else {
            Double difference = amountToPay - getBalance();
            setBalance(0.0);
            creditPart -= difference;
        }
        System.out.println("Оплата успешно произведена на сумму: " + amountToPay);
        return true;
    }

    @Override
    public void getBalanceInfo() {
        System.out.println("Собственные средства:  " + getBalance());
    }

    @Override
    public void getFundsInfo() {
        System.out.println("Кредитные средства:  " + creditPart);
        System.out.println("Собственные средства:  " + getBalance());

    }

    public Double getCreditPart() {
        return creditPart;
    }

    public void setCreditPart(Double creditPart) {
        this.creditPart = creditPart;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditLimit=" + creditLimit +
                ", creditPart=" + creditPart +
                '}';
    }
}