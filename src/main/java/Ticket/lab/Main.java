package Ticket.lab;

public class Main {
    public static void main(String[] args) {
        SalesLedger ledger = new SalesLedger();
        TicketOffice office = new TicketOffice(new TicketPrinter(), ledger);
        office.sell("Dune", 200, new FullTicket());
        office.sell("Dune", 200, new StudentTicket());
        office.sell("Rafadan Tayfa", 160, new ChildTicket());
        System.out.println("Toplam: " + ledger.count() + " bilet, " + ledger.total() + " TL");
    }
}
