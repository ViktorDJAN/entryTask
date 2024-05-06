package ru.kashtanov.cards;

import ru.kashtanov.model.BankCard;

import java.util.List;

/**
 * 4.	Класс CreditCard должен иметь дополнительное свойство «Кредитный лимит».
 * Основные средства кредитной карты состоят из двух частей: кредитная часть и собственные средства.
 * При пополнении кредитной карты необходимо сначала погасить кредитную часть, и только затем увеличивать собственные средства.
 * При оплате сначала списываются собственные средства, затем кредитные.
 */

// main funds consist of credit part and own part

public class CreditCard extends BankCard {
    private Double creditLimit;
    private Double creditPart;

    public CreditCard() {
    }

    public CreditCard(Double creditLimit, Double creditPart) {
        this.creditLimit = creditLimit;
        this.creditPart = creditPart;
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

    /**
     * При пополнении кредитной карты необходимо сначала погасить кредитную часть, и только затем увеличивать собственные средства.
     * * При оплате сначала списываются собственные средства, затем кредитные.
     */
    @Override
    public void topUpAccount(Double amount) {
        if (creditPart.equals(creditLimit)) {
            setBalance(getBalance() + amount);
        } else {
            creditPart += amount;
        }
        if (creditPart > creditLimit) {
            Double difference = creditPart - creditLimit;
            setBalance(getBalance() + difference);
            creditPart -= difference;
        }
        System.out.println("credit limit = " + creditLimit);
        System.out.println("credit part = " + creditPart);
        System.out.println("current balance = " + getBalance());

    }

    /**
     * При оплате сначала списываются собственные средства, затем кредитные.
     *
     * @return
     */
    @Override
    public boolean payOff(Double amountToPay) {
        Double difference = 0.0;
        if (getBalance() + creditPart < amountToPay) {
            System.out.println("It is impossible to pay off");
            return false;
        }
        if (getBalance() - amountToPay > 0) {
            setBalance(getBalance() - amountToPay);
            System.out.println("It is successfully paid");
            return true;
        } else {
            difference = amountToPay - getBalance();
            setBalance(0.0);
            creditPart -= difference;
            System.out.println("It is successfully paid");
            return true;
        }
    }

    @Override
    public void getBalanceInfo() {

    }

    @Override
    public List<? extends BankCard> getFundsInfo() {
        return null;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditLimit=" + creditLimit +
                ", creditPart=" + creditPart +
                '}';
    }
}
