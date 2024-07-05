package lesson15;

public class CountThread1 implements Runnable {
    CommonResource1 res;

    public CountThread1(CommonResource1 res) {
        this.res = res;
    }

    @Override
    public void run() {
        res.increment();
    }
}
