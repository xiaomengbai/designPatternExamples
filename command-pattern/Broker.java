import java.util.ArrayList;
import java.util.List;

public class Broker {

    /*
      Command Pattern

      abstract the commands.
      make the exection module stable, no matter
      how many new commands are added later

    */
    public List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrder(){
        for(Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}


/* Demo */

public class CommandPatternDemo {
    public static void main(String[] args){
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrder();
    }
}
