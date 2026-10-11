package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Courier {
    private final String name;
    private final List<Shipment> shipments = new ArrayList<>();

    public Courier(String name) {
        this.name = name;
    }

    public void assign(Shipment shipment) {
        this.shipments.add(shipment);
    }

    public List<String> destinations() {
        return shipments.stream()
                .map(Shipment::destinationCity)
                .collect(Collectors.toList());
    }
    public String getName() {
        return name;
    }

    public List<Shipment> getShipments() {
        return shipments;
    }
}
