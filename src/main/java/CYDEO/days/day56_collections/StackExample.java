package CYDEO.days.day56_collections;

import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(); // LIFO
        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack);

        System.out.println("At the top " + stack.peek()); // checks what's at the top of the stack
        stack.pop(); // removes the element at the top of the stack and returns it
        System.out.println(stack);
        System.out.println("At the top " + stack.peek());

        System.out.println(stack.pop()); // this was removed from the stack
        System.out.println(stack);

        // i can use the methods from list , but i want to use the functions of LIFO
        stack.addAll(List.of("b", "c", "d"));
        System.out.println(stack.get(0));
        stack.add("e");
        System.out.println(stack);

        //  />
    }
}
