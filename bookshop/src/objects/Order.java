package objects;

import state.*;

public class Order {
    public String productId;
    public int quantity;
    public String customerId;
    public CustomerAction state;
    public  OrderedState orderedState = new OrderedState();
    public  DeliveredState deliveredState = new DeliveredState();
    public  CancelledState cancelledState = new CancelledState();
    public  ReturnedState returnedState = new ReturnedState();
    public  ShipState shipState = new ShipState();

    public Order(String productId, int quantity, String customerId) {
        this.productId = productId;
        this.quantity = quantity;
        this.customerId = customerId;
        this.state = orderedState;
    }

    public static Order newOrder(String productId, int quantity, String customerId){
        return new Order(productId, quantity, customerId);
    }

    public void setState(CustomerAction newState) {
        this.state = newState;
    }

    public void customerOrder(){
        state.customerOrder(this);
    }

    public void customerWait(){
        state.customerWait(this);
    }

    public void customerCancel(){
        state.customerCancel(this);
    }

    public void customerReceive(){
        state.customerReceive(this);
    }

    public void customerReturn(){
        state.customerReturn(this);
    }

    public OrderedState getOrderedState() {
        return orderedState;
    }

    public DeliveredState getDeliveredState() {
        return deliveredState;
    }

    public CancelledState getCancelledState() {
        return cancelledState;
    }

    public ReturnedState getReturnedState() {
        return returnedState;
    }

    public ShipState getShipState() {
        return shipState;
    }
}
