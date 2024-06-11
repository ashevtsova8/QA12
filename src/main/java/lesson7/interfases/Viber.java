package lesson7.interfases;

public class Viber implements Messenger{
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Viber");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Читаем сообщение в Viber");
    }
}
