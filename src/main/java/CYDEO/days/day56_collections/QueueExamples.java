package CYDEO.days.day56_collections;

import java.util.*;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(10);
        queue.add(8);
        queue.add(2);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

        System.out.println("--------------------");

        ArrayDeque<String> queue2 = new ArrayDeque<>();
        queue2.offer("z");                              // offer() == add()
        queue2.offer("tuesday");
        queue2.offer("soft skills");
        queue2.offer("automation");

        System.out.println(queue2);
        System.out.println(queue2.peek()); // the other method to use - element()
        System.out.println(queue2.poll()); // the other method to use - remove()
        System.out.println(queue2);

        System.out.println(queue2.element());
        queue2.offerFirst("API");
        System.out.println(queue2);

        System.out.println(queue2.pollLast());
        System.out.println(queue2);

        // new ArrayDeque<>().remove() this one causes an exception
        new ArrayDeque<>().poll(); // returns null but not exception

        System.out.println("--------------------------------");
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(21,52,31,67));
        System.out.println(linkedList);
        linkedList.addLast(12);
        linkedList.addFirst(13);
        System.out.println(linkedList);
        System.out.println(linkedList.peek());
        System.out.println(linkedList.poll());
        System.out.println(linkedList);

        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);
    }
}

