package lesson7.interfases;

public class WhatsApp implements Messenger {

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в WhatsApp");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Читаем сообщение в WhatsApp");
    }
}
