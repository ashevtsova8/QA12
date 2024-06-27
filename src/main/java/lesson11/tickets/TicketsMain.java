package lesson11.tickets;

public class TicketsMain {
    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[] {
                new Ticket(1, "One-way-ticket", "USA", "27.06.2024"),
                new Ticket(2, "Return-ticket", "Belarus", "27.07.2024")
        };

        PurchaseTicketSystem<Ticket> purchaseTicketSystem = new PurchaseTicketSystem<>(tickets);
        purchaseTicketSystem.purchaseTicketSystemInfo();
    }
}
