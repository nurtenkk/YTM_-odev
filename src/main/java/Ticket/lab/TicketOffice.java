package Ticket.lab;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private final TicketPrinter printer;
    private final SalesLedger ledger;

    public TicketOffice(TicketPrinter printer, SalesLedger ledger) {
        this.printer = printer;
        this.ledger = ledger;
    }

    public Ticket sell(String film, int basePrice, TicketType type) {
        Ticket ticket = new Ticket(film, type.label(), type.price(basePrice));
        printer.print(ticket);
        ledger.add(ticket);
        return ticket;
    }
}
