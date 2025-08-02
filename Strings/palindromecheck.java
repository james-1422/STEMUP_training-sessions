package Strings;

import java.util.Scanner;

public class palindromecheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string" );
        String str=sc.nextLine();
        char rev;
        int len=str.length();
        char[] arr=str.toCharArray();
        for(int i=0;i<len/2;i++){
            rev=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=rev;
        }

        for(char rv:arr) {
            System.out.print(rv);


        }
        System.out.println();
        if (arr.equals(str)) {
            System.out.println("is palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}
