package lesson11;

import java.util.PriorityQueue;

public class PriorityQueueMain {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //добавляем элементы в конец очереди
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);

        for (int element : priorityQueue) {
            System.out.println(element);
        }

        priorityQueue.remove();

        System.out.println("After removing");
        for (int element : priorityQueue) {
            System.out.println(element);
        }

        System.out.println("PRIORITY_QUEUE_2");
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>();
        //добавляем элементы в конец очереди
        priorityQueue2.add(1);
        priorityQueue2.add(2);
        priorityQueue2.add(3);

        for (int element : priorityQueue2) {
            System.out.println(element);
        }

        priorityQueue2.poll();

        System.out.println("After removing");
        for (int element : priorityQueue2) {
            System.out.println(element);
        }
    }
}
