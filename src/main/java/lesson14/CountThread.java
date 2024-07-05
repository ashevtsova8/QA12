package lesson14;

public class CountThread implements Runnable {
    CommonResource result;

    public CountThread(CommonResource result) {
        this.result = result;
    }

    @Override
    public void run() {
        synchronized (result) {
            result.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s, result.x = %d\n", Thread.currentThread().getName(), result.x);
                result.x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new CountThread(commonResource));
            thread.setName("Поток " + i);
            thread.start();
        }
    }
}
