package Strings;

import java.util.Scanner;

public class reversethestring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string" );
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
            System.out.println(rev);
        }
        System.out.println("complete:"+rev);
    }
}
