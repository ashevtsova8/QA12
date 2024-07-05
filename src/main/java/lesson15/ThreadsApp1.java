package lesson15;

public class ThreadsApp1 {
    public static void main(String[] args) {
        CommonResource1 commonResource1 = new CommonResource1();
        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new CountThread1(commonResource1));
            thread.setName("Поток " + i);
            thread.start();
        }
    }
}
