package mobilya_mağazası;

public class main {
    public static String diningSet(FurnitureFactory factory){
        Table table =factory.createTable();
        Chair chair=factory.createChair();
        return "takım: " + table.describe() + chair.describe();
    }
    public static void main(String[] args){
        
        ModernShowroom m =new ModernShowroom();

        m.display();
        FurnitureFactory fm = new ModernFactory() ;
        FurnitureFactory fc=new ClassicFactory();
        diningSet(fm);
        diningSet(fc);
    }
}
