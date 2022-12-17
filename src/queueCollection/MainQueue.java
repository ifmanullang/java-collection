package queueCollection;

import java.util.ArrayDeque;
import java.util.Queue;
public class MainQueue {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>(15);
        queue.offer("Java");
        queue.offer("HTML");
        queue.offer("CSS");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
            System.out.println(queue.size());
        }

        System.out.println(queue.size());
    }

}