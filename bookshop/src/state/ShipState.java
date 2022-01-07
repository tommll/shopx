package state;

import objects.Order;

public class ShipState implements CustomerAction {
    public void customerOrder(Order order){
        System.out.println("This is an invalid operation for this state");
    }

    public void customerWait(Order order){
        System.out.println("This is an invalid operation for this state");
    }

    public void customerCancel(Order order){
        order.setState(order.getCancelledState());
    }

    public void customerReturn(Order order){
        System.out.println("This is an invalid operation for this state");
    }

    public void customerReceive(Order order){
        order.setState(order.getDeliveredState());
    }
}
