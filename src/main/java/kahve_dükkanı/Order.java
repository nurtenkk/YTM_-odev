package kahve_dükkanı;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int number;
    private List<Coffee> items;

    public Order(int number, List<Coffee> items) {
        this.number = OrderCounter.getInstance().nextNumber();
        this.items=new ArrayList<>();
    }
    public Order(Order o){
        this.number=OrderCounter.getInstance().nextNumber();
        this.items=new ArrayList<>(o.items);
    }
    public Order copy(){
        return new Order(this);
    }
    public void add(Coffee coffee){
        items.add(coffee);

    }

}
