package HW.AUGUST01.programs;

import java.util.LinkedList;
import java.util.Scanner;

public class AmstrongnousingLinkedList {
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



         for(int i=0;i<list.size();i++){
             int res=0;
            int value=list.get(i);
            int b = value;
             int a = String.valueOf(value).length();
            while(value>0){
                int temp = value % 10;
                res += Math.pow(temp,a);
                value = value/10;
            }
             if(res== b){
                 System.out.println("it is a amstrong number: "+ b);
             }
             else {
                 System.out.println("it is not amstrong noo "+ b);
             }
        }




    }
}
