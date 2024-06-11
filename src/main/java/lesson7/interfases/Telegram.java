package lesson7.interfases;

public class Telegram implements Messenger, Application {

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Telegram");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Читаем сообщение в Telegram");
    }
}
