package lesson11_12.tickets;

public class PurchaseTicketSystem<T extends ITicket> {
    T[] tickets;

    public PurchaseTicketSystem(T[] tickets) {
        this.tickets = tickets;
    }

    public void purchaseTicketSystemInfo() {
        for (ITicket ticket : tickets) {
            System.out.println(ticket.getType());
        }
    }
}
