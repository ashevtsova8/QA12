package lesson7.interfases;

public class Button {
    EventHandler handler;

    Button(EventHandler handler) {
        this.handler = handler;
    }

    public void click() {
        handler.execute();
    }
}
