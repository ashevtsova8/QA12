package lesson14;

public class JThread1 implements Runnable {
    @Override
    public void run() {
        System.out.printf("Поток %s начал работу\n", Thread.currentThread().getName());
        int counter = 1;
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Цикл " + counter++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(Thread.currentThread().getName() + " был прерван");
                System.out.println(Thread.currentThread().isInterrupted());//false
                Thread.currentThread().interrupt();
//                break; 2й вариант завершения потока при наличии блока catch
            }
        }
        System.out.printf("Поток %s завершил работу\n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Главный поток стартовал");
        Thread thread = new Thread(new JThread1());
        thread.start();
        try {
            Thread.sleep(150);
            thread.interrupt();
            Thread.sleep(150);
        } catch (InterruptedException ex) {
            System.out.println("Поток прерван");
        }
        System.out.println("Главный поток завершил работу");
    }
}
