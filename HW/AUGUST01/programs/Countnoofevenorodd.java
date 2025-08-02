package HW.AUGUST01.programs;

import java.util.LinkedList;
import java.util.Scanner;

public class Countnoofevenorodd {
    public static void main(String[] args){
        System.out.println("output bY JAMES J");
        LinkedList<Integer> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length linked list: ");
        int n=sc.nextInt();
        System.out.println("enter the "+ n +" nos: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.add(value);
        }
        System.out.println(list);
        int even=0;
        int odd=0;
        for (int i=0;i<n;i++) {
            int value = list.get(i);
            if (value % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("the no of evens  in the Linkedlist are: "+even+" \n the no of odd in the linkedlist are: "+odd);

        }
}
