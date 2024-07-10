package lesson14.exchanger;

import java.util.concurrent.Exchanger;

public class GetThread implements Runnable {
    Exchanger<String> exchanger;
    String message;

    public GetThread(Exchanger exchanger) {
        this.exchanger = exchanger;
        message = "Hello from GetThread";
    }

    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println("GetThread получил: " + message);
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
