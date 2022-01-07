package payment;

import db.BankDB;

public class PaymentFactory {
    BankDB bankDB;

    public PaymentFactory(BankDB receiverBank) {
        this.bankDB = receiverBank;
    }

    public CashPayment createCashPayment(String location){
        return new CashPayment(bankDB, location);
    }

    public CreditCardPayment createCreditCardPayment(String nameOnCard, int key){
        return new CreditCardPayment(bankDB, nameOnCard, key);
    }

}
