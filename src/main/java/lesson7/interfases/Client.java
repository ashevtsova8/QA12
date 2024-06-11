package lesson7.interfases;

public class Client {
//    private Viber viber;
//    private Telegram telegram;
//    private WhatsApp whatsApp;
    private Messenger messenger;

    public Client() {
        this.messenger = new Telegram();
    }
}
