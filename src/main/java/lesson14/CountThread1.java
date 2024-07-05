package lesson14;

public class CountThread1 implements Runnable {
    CommonResource1 result;
    public CountThread1(CommonResource1 result) {
        this.result = result;
    }

    @Override
    public void run() {
       result.increment();
    }

    public static void main(String[] args) {
        CommonResource1 commonResource1 = new CommonResource1();
        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new CountThread1(commonResource1));
            thread.setName("Поток " + i);
            thread.start();
        }
    }
}
