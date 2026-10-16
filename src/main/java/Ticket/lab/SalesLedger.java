package Ticket.lab;

import java.util.ArrayList;
import java.util.List;

public class SalesLedger {
    private final List<Ticket> tickets = new ArrayList<>();

    public void add(Ticket ticket) {
        tickets.add(ticket);
    }

    public int count() {
        return tickets.size();
    }

    public int total() {
        return tickets.stream().mapToInt(Ticket::price).sum();
    }
}
