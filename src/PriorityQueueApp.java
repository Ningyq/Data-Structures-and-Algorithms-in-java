import java.io.IOException;

public class PriorityQueueApp {

    public static void main(String[] args) throws IOException {
        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insert(30);
        priorityQueue.insert(50);
        priorityQueue.insert(10);
        priorityQueue.insert(40);
        priorityQueue.insert(20);

        while (!priorityQueue.isEmpty()) {
            long item = priorityQueue.remove();
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
