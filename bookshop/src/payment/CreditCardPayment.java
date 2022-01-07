package payment;

import db.BankDB;

public class CreditCardPayment implements Payable{
    BankDB db;
    String nameOnCard;
    int key;

    public CreditCardPayment(BankDB db, String nameOnCard, int key) {
        this.db = db;
        this.nameOnCard = nameOnCard;
        this.key = key;
    }

    public void pay(int amount){
        // logic for processing cash
    }
}
