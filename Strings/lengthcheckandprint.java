package Strings;

import java.util.Scanner;

public class lengthcheckandprint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the txt" );
        String str=sc.nextLine();
        int len=str.length();
        if(len>10){
            System.out.println("hello good morning");
        }else {
            System.out.println("length of string is less" );
        }
        System.out.println("enter your name: ");
        String str2=sc.nextLine();

        if(str.isEmpty()){
            System.out.println("invalid user");

        }
        else{
            System.out.println("good morning "+str2);
        }

        System.out.println(str2.replace(str2.charAt(0),'$').replace(str2.charAt(2),'@').toUpperCase());
//        System.out.println(str2.toUpperCase());


    }
}
