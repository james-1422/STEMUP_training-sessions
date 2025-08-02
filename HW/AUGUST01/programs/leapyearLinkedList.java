package HW.AUGUST01.programs;

import java.util.LinkedList;
import java.util.Scanner;

public class leapyearLinkedList {
    public static void main(String[] args){
        System.out.println("output bY JAMES J");
        LinkedList<Integer> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length linked list: ");
        int n=sc.nextInt();
        System.out.println("enter the "+ n +" no of years: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.add(value);
        }
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            int year = list.get(i);
            if((year%4==0 && year % 100 != 0) ||(year % 400 ==0)  ){

                        System.out.println(year +" is leap year");
            }
            else{
                System.out.println(year +" is not year");
            }
        }


    }
}
