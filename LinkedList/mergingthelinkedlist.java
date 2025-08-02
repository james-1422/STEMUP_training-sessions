package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class mergingthelinkedlist {
    public static void main(String[] args){
        LinkedList<Integer> list1=new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        LinkedList<Integer> list2=new LinkedList<>(Arrays.asList(10,11,12,13));
        System.out.println(list1);
        System.out.println(list2);
        list1.addAll(list2);
        System.out.println("after merging the 2 linked list: "+list1);
    }
}
