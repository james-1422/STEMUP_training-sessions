package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class splitandreverseonstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the long string:");
        String str=sc.nextLine();
        String[] split=str.split(" ");
        System.out.println("splitted string: ");
        for(String i:split){
            System.out.print(i);
        }
        System.out.println();
        int len=split.length;
        String temp;
        for (int i = 0; i < len / 2; i++) {
            temp = split[i];
            split[i] = split[len - i - 1];
            split[len - i - 1] = temp;
        }
        for(String i:split){
            System.out.print(i);
        }

//        for(int i=len-1;i>=0;i--){
//            System.out.println(split[i]+" ");
//        }
    }
}
