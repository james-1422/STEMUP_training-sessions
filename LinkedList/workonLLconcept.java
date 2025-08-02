package LinkedList;

import java.sql.SQLOutput;
import java.util.*;

public class workonLLconcept {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();

        System.out.println(list);
        for(int i=0;i<5;i++){
//            list.offer(i+1);
            boolean var=list.offer(i+1);
            int a=i+1;
            if(var==true) {
                System.out.println("the element " + a + " is added at the index  " + i + " successfully");
            }
        }
        System.out.println(list);

        //SORTING IN DESECENDING ORDER
        Iterator<Integer> itr=list.descendingIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        //replace using the user input
        Scanner sc=new Scanner(System.in);
        System.out.println("in which index it should be replaced: ");
        int a=sc.nextInt();
        System.out.println("enter value to be replaced: ");
        int n=sc.nextInt();
        list.set(a,n);
        System.out.println("the list after replacing: "+ list);

        //PRINTING THE SIZE OF LIST
        System.out.println("the size of list: "+ list.size());

        //CREATE AND MERGEING ANOTHER LIST
        LinkedList<Integer> newlist= new LinkedList<>(Arrays.asList(2,9,1,4,5,2,5,7));
        list.addAll(newlist);
        System.out.println("the merged list is: "+ list);

        //sorting
        Collections.sort(list);
        System.out.println("the sorted list after merging is : "+ list);

        //removing the duplicates
        LinkedList<Integer> unique=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:list){
            if(set.add(i)){
                unique.add(i);
            }

        }
        System.out.println("after removing the duplicate: "+unique);

        //reversing the sorted list
        Collections.reverse(unique);
        System.out.println("the reversed list is: "+unique);


    }
}
