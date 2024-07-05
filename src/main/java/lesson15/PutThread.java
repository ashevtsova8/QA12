package lesson15;

import java.util.concurrent.Exchanger;

public class PutThread implements Runnable {
    Exchanger<String> exchanger;
    String message;

    PutThread(Exchanger exchanger) {
        this.exchanger = exchanger;
        message = "Hello world!";
    }

    public void run() {
        try {
            message =  exchanger.exchange(message);
            System.out.println("PutThread получил: " + message);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
