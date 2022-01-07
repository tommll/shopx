package payment;

import db.BankDB;

public class CashPayment implements Payable{
    BankDB db;
    String location;

    public CashPayment(BankDB db, String location) {
        this.db = db;
        this.location = location;
    }

    public void pay(int amount){
        // logic for processing cash
    }
}
