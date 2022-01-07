package command.payment;

import command.Command;
import db.BankDB;
import payment.CashPayment;
import payment.CreditCardPayment;
import payment.Payable;


public class PayCommand implements Command {
    Payable payMethod;
    int amount;

    public PayCommand(Payable paymentMethod) {
        payMethod = paymentMethod;
    }

    public void setParameters(int amount) {
        this.amount = amount;
    }

    public void execute(){
        payMethod.pay(amount);
    }
}
