package db;

public class BankDB {
    int balance;

    public void receive(int amount){
        balance += amount;
    }

    public void refund(int amount){
        balance -= amount;
    }
}
