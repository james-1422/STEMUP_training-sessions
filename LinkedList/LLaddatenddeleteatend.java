package LinkedList;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class LLaddatenddeleteatend {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        System.out.println(list);
        if(list.isEmpty()){
            for(int i=1;i<=10;i++)
                list.add(i);
        }
        System.out.println(list);
        list.add(11);
        list.add(10);
        System.out.println(list);
        //removing from the head of list
        System.out.println("removeing element from the tail: ");
        System.out.println(list.remove() +"\n"+list);
        //checking the presence of element 7
        System.out.println("checking if 7 is present in the list: "+list.contains(7));
        if(list.contains(7)){
            System.out.println("the index of 7 is; "+list.indexOf(7));
        }
        //modify 5th index element
        list.set(5,1111);
        System.out.println("after modifying the 5th element with 1111: "+list);
//sorting
        Collections.sort(list);
        System.out.println("the sorted list is: "+list);

        //traverse of list
        System.out.println("traversing the list using for loop: ");
        for(int i:list){
            System.out.print(i+ " ");
        }
        System.out.println();

        //removing the duplicate
        LinkedList<Integer> unique=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:list){
            if(set.add(i)){
                unique.add(i);
            }

        }
        System.out.println("after removing the duplicate: "+unique);

        //reversing
        Collections.reverse(unique);
        System.out.println("after reversing the list: "+unique);

        unique.clear();
        System.out.println(unique);
        if(unique.isEmpty()){
            System.out.println("data deleted successfully");

        }
    }
}
