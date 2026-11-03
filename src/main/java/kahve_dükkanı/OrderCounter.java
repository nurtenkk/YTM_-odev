package kahve_dükkanı;

public class OrderCounter {
    private static final OrderCounter INSTANCE = new OrderCounter();
    private int next=1;
    private OrderCounter(){

    }
    public static class Holder {
        private static final OrderCounter INSTANCE =new OrderCounter();

    }
    public static OrderCounter getInstance(){
        return Holder.INSTANCE;
    }
    public int nextNumber(){
        return next++;
    }
}
