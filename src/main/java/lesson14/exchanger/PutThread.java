package lesson14.exchanger;

import java.util.concurrent.Exchanger;

public class PutThread implements Runnable {
    Exchanger<String> exchanger;
    String message;

    public PutThread(Exchanger exchanger) {
        this.exchanger = exchanger;
        message = "Hello from PutThread";
    }

    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println("PutThread получил: " + message);
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
