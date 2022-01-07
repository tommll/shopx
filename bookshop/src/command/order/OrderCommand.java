package command.order;

import command.Command;
import db.WareHouseDB;

public class OrderCommand implements Command {
    WareHouseDB db;
    String productId;
    int quantity;
    String customerId;

    public OrderCommand(WareHouseDB db) {
        this.db = db;
    }

    public void setParameters(String productId, int quantity, String customerId){
        this.productId = productId;
        this.quantity = quantity;
        this.customerId = customerId;
    }

    public void execute(){
        db.placeOrder(productId, quantity, customerId);
    }
}




