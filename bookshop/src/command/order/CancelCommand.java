package command.order;

import command.Command;
import db.WareHouseDB;

public class CancelCommand implements Command {
    WareHouseDB db;
    String productId;
    int quantity;
    String customerId;

    public CancelCommand(WareHouseDB db) {
        this.db = db;
    }

    public void setParameters(String productId, int quantity, String customerId){
        this.productId = productId;
        this.quantity = quantity;
        this.customerId = customerId;
    }

    public void execute(){
        db.cancelOrder(productId, quantity, customerId);
    }
}
