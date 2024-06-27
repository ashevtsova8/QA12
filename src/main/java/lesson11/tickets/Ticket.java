package lesson11.tickets;

public class Ticket implements ITicket{
    private int id;
    private String type;
    private String destination;
    private String purchaseDate;

    public Ticket(int id, String type, String destination, String purchaseDate) {
        this.id = id;
        this.type = type;
        this.destination = destination;
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String getType() {
        return type;
    }
}
