package lesson11;

import java.util.PriorityQueue;

public class PriorityQueueMain1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //добавляем элементы в конец очереди
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);

        for (int element : priorityQueue) {
            System.out.println(element);
        }

        priorityQueue.remove(2);

        System.out.println("After removing");
        for (int element : priorityQueue) {
            System.out.println(element);
        }
    }
}
