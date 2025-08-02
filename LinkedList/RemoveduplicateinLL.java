package LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveduplicateinLL {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,1,35,9,85,1,3));
        System.out.println(list);
        LinkedList<Integer> unique=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();//hashset is a collection type in java which stores only the unique items
        for(int i:list) {
            if (set.add(i)) {
                unique.add(i);
            }
        }
        System.out.println(unique);
    }
}

