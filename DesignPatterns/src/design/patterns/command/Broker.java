package design.patterns.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Broker {
    private final List<Order> orders = new ArrayList<>();
    public void takeOrder(Order order){
        this.orders.add(order);
    }
    public void placeOrders(){
        this.orders.forEach(order ->{
            order.execute("LN0000PREST121");
        });
    }
}
