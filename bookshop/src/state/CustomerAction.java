package state;

import objects.*;

public interface CustomerAction {
    void customerOrder(Order order);

    void customerWait(Order order);

    void customerCancel(Order order);

    void customerReturn(Order order);

    void customerReceive(Order order);


}
