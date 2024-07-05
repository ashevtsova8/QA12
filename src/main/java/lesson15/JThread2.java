package lesson15;

public class JThread2 implements Runnable {
    @Override
    public void run() {
        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
        int counter = 1;//счетчик циклов
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Цикл " + counter++);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " был прерван здесь");
                System.out.println(Thread.currentThread().isInterrupted());//false
                Thread.currentThread().interrupt();//повторно сбрасываем состояние
        }
        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }
}
