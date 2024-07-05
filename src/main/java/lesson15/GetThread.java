package lesson15;

import java.util.concurrent.Exchanger;

public class GetThread implements Runnable {
    Exchanger<String> exchanger;
    String message;

    GetThread(Exchanger exchanger) {
        this.exchanger = exchanger;
        message = "Привет, мир!";
    }

    public void run() {
        try {
            message =  exchanger.exchange(message);
            System.out.println("GetThread получил: " + message);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
