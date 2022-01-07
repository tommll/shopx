import command.order.CancelCommand;
import command.order.OrderCommand;
import command.order.ReturnCommand;
import db.WareHouseDB;
import db.BankDB;
import command.payment.PayCommand;
import command.user_account.LoginCommand;
import command.user_account.SignUpCommand;
import db.UserDB;
import objects.Order;
import payment.CashPayment;
import payment.PaymentFactory;

public class Main {
    public static void main(String[] args){
        System.out.println("HEllO");
        BankDB bankDB = new BankDB();
        UserDB userDB = new UserDB();
        WareHouseDB wareHouseDB = new WareHouseDB();
        PaymentFactory paymentFactory = new PaymentFactory(bankDB);

        LoginCommand loginCommand = new LoginCommand(userDB);
        loginCommand.setParameters("Tung","123");
        loginCommand.execute();

        PayCommand payCommand = new PayCommand(paymentFactory.createCashPayment("HCM"));
        payCommand.setParameters(10);
        payCommand.execute();

        OrderCommand orderCommand = new OrderCommand(wareHouseDB);
        orderCommand.setParameters("1a", 1, "xyz");
        orderCommand.execute();



    }
}
