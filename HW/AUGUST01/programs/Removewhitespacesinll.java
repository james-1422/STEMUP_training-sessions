package HW.AUGUST01.programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Removewhitespacesinll {
    public static void main(String[] args){
        System.out.println("output bY JAMES J");
        LinkedList<String> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length linked list: ");
        int n=sc.nextInt();
        System.out.println("enter the n number of  string : ");
        sc.nextLine();
        for(int i=0;i<n;i++){
            String value=sc.nextLine();
            list.add(value);
        }
        System.out.println(list);
        Iterator<String> itr=list.iterator();
        while (itr.hasNext()){
            String str=itr.next();
            if(str.trim().isEmpty()){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
