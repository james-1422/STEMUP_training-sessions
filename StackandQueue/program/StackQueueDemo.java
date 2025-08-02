package StackandQueue;

import java.util.*;

public class StackQueueDemo {
    public static void main(String[] args){

        System.out.println("OUTPUT BY JAMES J");

        //====stack demonstration====
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack);
        System.out.println();
        System.out.println("push operation: ");
        //push or inserting the element to the stack
        stack.push(3);
        stack.push(8);
        stack.push(1);
        stack.push(6);
        stack.push(2);
        stack.push(7);
        System.out.println(stack);
        System.out.println();

        //pop used to remove the element from the stack
        System.out.println("pop operation: ");
        System.out.println(stack.pop());//removes the element from the end
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println();

        //peek operation
        System.out.println("peek operation");
        System.out.println(stack.peek());//peek doesnot remove the element it only retrives the element
        System.out.println(stack);


        stack.push(8);
        //empty check of stack
        System.out.println();
        System.out.println("is stack empty: "+ stack.isEmpty());
        System.out.println();
        System.out.println(stack);

        //searching an element
        System.out.println("searching the element 1: "+ stack.search(1));
        System.out.println("searching the element 5: "+ stack.search(5));


        System.out.println();
        System.out.println("queue starts here");


        System.out.println("OUTPUT BY JAMES J");

        //----Queue Demonstration using LinkedList----
        Queue<String> queue=new LinkedList<>();
        System.out.println(queue);
        System.out.println();

        System.out.println("queue operations start from here: ");
        //insert in the elements to the queue
        System.out.println();
        System.out.println("adding the elements (enqueue): ");
        queue.add("apple");//adds the element given
        queue.offer("mango");//same as add operation
        queue.add("pineapple");
        queue.add("cherry");
        System.out.println(queue);
        System.out.println();

        //peek method on queue
        System.out.println("peek opertion on queue; "+queue.peek());//returns the head or first entered element

        //removing the element from the queue
        System.out.println();
        System.out.println(queue);
        System.out.println("removing the element using remove()(dequeue): "+ queue.remove());//removes and returns the head
        System.out.println();
        System.out.println(queue);
        System.out.println("removing the element using poll(): "+ queue.poll());//removes and returns the head
        System.out.println();

        System.out.println(queue);
        System.out.println("using the operation of empty to check: "+ queue.isEmpty());
        queue.add("apple");
        queue.add("kiwi");
        queue.add("orange");
        System.out.println();
        System.out.println(queue);



    }
}
