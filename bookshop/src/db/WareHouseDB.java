package db;

import objects.Order;
import objects.Product;

import java.util.List;

public class WareHouseDB {
    List<ProductInventory> inventories;
    List<Order> orderList;

    private void addProduct(Product product, int initialQuantity){
        ProductInventory x = new ProductInventory(product, initialQuantity);
        inventories.add(x);
    }

    private void addQuantity(String productId, int quantity){
        for (ProductInventory x : inventories){
            if (x.product.id.equals(productId)){
                x.quantityOnPremise += quantity;
            }
        }
    }

    public void placeOrder(String productId, int quantity, String customerId) {
        for (ProductInventory x : inventories) {
            if (x.product.id.equals(productId) && x.quantityOnPremise >= quantity){
                x.quantityOnPremise -= quantity;
                Order order = Order.newOrder(productId, quantity, customerId);
                order.customerWait(); // change state of order
                orderList.add(order);
            }
        }
    }

    public void cancelOrder(String productId, int quantity, String customerId) {
        Order order = Order.newOrder(productId, quantity, customerId);
        for (Order x : orderList){
            if (x.equals(order)){
                x.customerCancel();
                orderList.remove(order);
            }
        }
        addQuantity(productId, quantity);
    }

    public void returnOrder(String productId, int quantity, String customerId) {
        for (Order x : orderList){
            if (x.productId.equals(productId)){
                x.customerReturn(); // change state of order
            }
        }
        addQuantity(productId, quantity);
    }
}

class ProductInventory{
    Product product;
    int quantityOnPremise;

    public ProductInventory(Product product, int quantityOnPremise) {
        this.product = product;
        this.quantityOnPremise = quantityOnPremise;
    }
}