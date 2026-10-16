package Ticket.lab;

public class StudentTicket implements TicketType {
    @Override
    public String label() {
        return "Öğrenci";
    }

    @Override
    public int price(int basePrice) {
        return basePrice * 60 / 100;
    }
}

