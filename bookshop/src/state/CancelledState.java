package state;

import objects.Order;

public class CancelledState implements CustomerAction {
    public void customerOrder(Order order){
        order.setState(order.getOrderedState());
    }

    public void customerWait(Order order){
        System.out.println("This is an invalid operation for this state");
    }

    public void customerCancel(Order order){
        System.out.println("This is an invalid operation for this state");
    }

    public void customerReturn(Order order){
        System.out.println("This is an invalid operation for this state");
    }

    public void customerReceive(Order order){
        System.out.println("This is an invalid operation for this state");
    }
}
