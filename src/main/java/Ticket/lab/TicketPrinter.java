package Ticket.lab;

public class TicketPrinter {
    public void print(Ticket ticket) {
        System.out.println("[Bilet] " + ticket.film() + " | " + ticket.type()
                + " | " + ticket.price() + " TL");
    }
}

