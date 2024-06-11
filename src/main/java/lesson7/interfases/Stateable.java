package lesson7.interfases;

public interface Stateable {
    int OPEN = 1;
    int CLOSED = 0;

    void printState(int n);
}
