package LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(130);
        list.add(20);
        list.add(80);
        list.add(40);
        list.add(90);
        list.add(60);
        list.add(10);
        System.out.println("the list is: "+list);
        Collections.reverse(list);//used coollections library , it contains the set of interfaces of(List, Set,map)--and set of classes of (ArrayList,hashset, and hashmap)
        System.out.println("the reversed list: "+ list);

        Collections.sort(list);
        System.out.println("the sorted list is: "+list);
////Collections library doesnot work on the arrays
//        int[] arr={1,2,3,4,5,6,7};
//        Collections.reverse(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

    }
}
