package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class LinkedListMethodDemo {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();

        //adding the elements to the list
        list.add("Apple");                           //ADD ath the end of the list
        list.addFirst("Pineapple");              //ADD at the first or it will be the first element
        list.addLast("Watermelon");              //ADD at the end as last element
        list.add(1,"Orange");         //ADD at the given index
        System.out.println("the added elements: "+ list);
        System.out.println();


        //adding the elements using offer method (similar to add but returns boolean value)
        list.offer("Grapes");  //add to the tail of the list
        list.offerFirst("Mango");  //add to the head of the list
        list.offerLast("kiwi");  //add to the tail of the list
        System.out.println("after adding some elements using offer method: "+list);
        System.out.println("checking the offer methods returns: "+list.offer("Grapes"));
        System.out.println("checking the offer methods returns: "+list.offerFirst("Mango"));
        System.out.println("checking the offer methods returns: "+list.offerLast("Kiwi"));
//        System.out.println("checking the offer methods returns: "+list.offer());
//if we pass the blank the it returns the error
        System.out.println();

        System.out.println(list
        );


        System.out.println();

        //GET methods
        System.out.println("get at index2: "+ list.get(4)); //returns the element at the given index
        System.out.println("get the first element: "+ list.getFirst()); //returns the element which is the head or first element
        System.out.println("get the last element: "+ list.getLast()); //returns the element which is at the end of the list
        System.out.println("peek the  element: "+ list.peek());// returns the first element
        System.out.println("peek  the  first element: "+ list.peekFirst());//same as peek returns the first element
        System.out.println("peek the last element: "+ list.peekLast());//returns the last element

        System.out.println();

        //----remove methods----
        System.out.println(list.remove());//removes the heador first of the list
        System.out.println(list.remove(3));//removes the element of the given index
        System.out.println(list.remove("orange"));//removes the given element from the list if not present returns boolean case also matters
        System.out.println(list.removeFirst());//removes the first element
        System.out.println(list.removeLast());//removes the last element

        System.out.println("list after the above 'get', 'add'  and 'remove' methods: "+list);

        System.out.println();

        //poll methods (removes and returns )
        System.out.println(list.poll());//remove first
        System.out.println(list.pollFirst());//remove first
        System.out.println(list.pollLast());//remove last


        list.add("lemon");
        list.add("papaya");
        list.add("gauva");
        list.add("kiwi");
        System.out.println();
        System.out.println("after poll and remove method: "+list);

        //-----contain/index-------
        System.out.println(list.contains("Mango"));//returns the boolean value
        System.out.println(list.contains("Grapes"));
        System.out.println(list.indexOf("lemon"));//returns the index of the element
        System.out.println(list.lastIndexOf("kiwi"));//returns the last time of the element givven present in the list

        System.out.println();
        System.out.println(list);

        //----size and  empty----
//        System.out.println("the size of the list; "+ list.length());//.length is not available for linked list
        System.out.println("the size of the list; "+ list.size());//returns the size of list
        System.out.println("the size of the list; "+ list.isEmpty());//check wether the list is empty or not

        System.out.println();
        System.out.println(list);

        //---SET or  UPDATE----
        list.set(1,"Mango");//replaces the element at the given index
        System.out.println("after the set method: "+list);


        System.out.println();
        //------TRAVERSAL-------
        System.out.println(list);
        System.out.println("printing the elements or traversal using for each loop:");
        for(String fruits:list){
            System.out.println(fruits);
        }
//        System.out.println("printing the elements or traversal using for loop:");
//        for(char i='A';i<list.size();i++){
//            System.out.print(list(i));
//        }

        //-----ITERATOR------
        System.out.println();
        System.out.println(list);
        System.out.println("travesal using iterator");
        Iterator<String> itr= list.iterator();//iterator is a directory where we store the value of list

        while(itr.hasNext()){//hasNext() is used as the incrementing thing when compared to forloop or ++

            System.out.println(itr.next());//prints the element stored in the iterator
        }

        //----reversing the linked list using descendingiterator -----
        System.out.println();
        System.out.println(list);
        System.out.println("reversing list using descending iterator");
        Iterator<String> revitr= list.descendingIterator();
        while(revitr.hasNext()){
            System.out.print(revitr.next()+" ");
        }

        System.out.println();
        System.out.println(list);
        //----STACK methods-----
        list.push("strawberry");//add the element at the starting point
        System.out.println("after push operation: " + list);

        System.out.println("POPPING THE element from the list: " + list.pop());//deletes the element from the starting point itself
        System.out.println(list);


        System.out.println();
        System.out.println(list);
        //----BULK operations----
        LinkedList<String> newlist=new LinkedList<>();
        //adding elements to new list
        newlist.add("Strawberry");
        newlist.add("orange");
        System.out.println(newlist);
        System.out.println();
        list.addAll(newlist);//adding all the elements to the list from the newlist
        System.out.println("after add the new list to the list: "+list);

        System.out.println();
        System.out.println(list);
        //----converting  the linked list to array----
        Object[] arr=list.toArray();//to convert we use the object library
        System.out.println("the converted array: ");
        for (Object in:arr){
            System.out.println(in);
        }


        System.out.println();
        System.out.println(list);
        list.clear();//clears all the element in the list
        System.out.println(list);
        System.out.println("after the clear method check wether it is empty or not: "+ list.isEmpty());//check the list and returns boolean value



    }
}
