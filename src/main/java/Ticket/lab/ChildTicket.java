package Ticket.lab;

public class ChildTicket implements TicketType {
    @Override
    public String label() {
        return "Çocuk";
    }

    @Override
    public int price(int basePrice) {
        return basePrice / 2;
    }
}
