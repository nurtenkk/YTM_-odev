package lab;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("İzmir", "Bornova");
        Customer customer1 = new Customer(" Ali Kaya ", address1);

        Address address2 = new Address("Ankara", "Çankaya");
        Customer customer2 = new Customer("Elif Demir", address2);


        Shipment s1 = new Shipment("KG-1001", customer1);
        s1.addParcel("Kitap", 1200);
        s1.addParcel("Kupa", 400);

        Shipment s2 = new Shipment("KG-1002", customer2);
        s2.addParcel("Laptop", 2500);


        Courier mert = new Courier("Mert");
        mert.assign(s1);
        mert.assign(s2);


        System.out.println(s1.trackingNo() + ": " + s1.destinationCity() + ", " + s1.parcels().size() + " koli, " + s1.totalGrams() + " g");


        System.out.println("Mert rotası: " + mert.destinations());


        boolean isSameAddress = customer1.address().equals(new Address("İzmir", "Bornova"));
        System.out.println("Aynı adres mi? " + isSameAddress);


        try {
            s1.parcels().clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("Hata: koli listesi dışarıdan değiştirilemez");
        }


        try {
            s2.addParcel("Boş kutu", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}