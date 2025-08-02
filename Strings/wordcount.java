package Strings;

import java.util.Scanner;

public class wordcount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string sentence: ");
        String sentence=sc.nextLine();
        String[] words=sentence.trim().split(" ");
        System.out.println("count words: "+ words.length);
    }
}
