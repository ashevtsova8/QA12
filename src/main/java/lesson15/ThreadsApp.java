package lesson15;

public class ThreadsApp {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new CountThread(commonResource));
            thread.setName("Поток " + i);
            thread.start();
        }
    }
}
