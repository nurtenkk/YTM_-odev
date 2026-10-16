package Ticket.lab;

public class FullTicket implements TicketType{

    @Override
    public String label() {
        return "Tam";
    }

    @Override
    public int price(int basePrice) {
        return basePrice;
    }


}
