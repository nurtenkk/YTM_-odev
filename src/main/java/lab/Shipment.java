package lab;

import java.util.ArrayList;
import java.util.List;

public class Shipment {
    private final String trackingNo;
    private final Customer receiver;
    private final List<Parcel> parcels = new ArrayList<>();

    public Shipment(String trackingNo, Customer receiver) {
        this.trackingNo = trackingNo;
        this.receiver = receiver;
    }

    public void addParcel(String label, int grams) {
        Parcel parcel = new Parcel(label, grams);
        this.parcels.add(parcel);
    }
    public List<Parcel> parcels() {
        return List.copyOf(parcels);
    }
    public int totalGrams() {
        return parcels.stream().mapToInt(Parcel::grams).sum();
    }
    public String destinationCity() {
        return receiver.city();
    }

    public String trackingNo() {
        return trackingNo;
    }

    public Customer getReceiver() {
        return receiver;
    }

    public List<Parcel> getParcels() {
        return parcels;
    }
}
