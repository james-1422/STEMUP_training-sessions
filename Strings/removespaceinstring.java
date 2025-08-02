package Strings;

import java.util.Scanner;

public class removespaceinstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        String result=str.replace(" ","");
        System.out.println("after removing all space :  "+result);
    }
}
