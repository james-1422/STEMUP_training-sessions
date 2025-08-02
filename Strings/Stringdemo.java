package Strings;

import java.util.Scanner;

public class Stringdemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str= sc.nextLine();

        //length of the string
        System.out.println("the length of the inserted string is: " + str.length());

        //character at a specific index
        System.out.println("character at the index 2;"+ str.charAt(2));

        //make a substring from index given
        System.out.println("the substring from index 4:"+ str.substring(4));

        //make the substring from start index to any end index
        System.out.println("the substring from index 2 to 4: "+ str.substring(2,4));

        //convert to uppercase
        System.out.println("the strikng converted to the upper case:"+ str.toUpperCase());

        //convert to lowercase
        System.out.println("the string converted to the lowercase: " + str.toLowerCase());

        //trim leading and trailing spaces
        System.out.println("the trimmed string is:"+ str.trim() +"  ");

        // replacing the characters
        System.out.println("replace 'a' with 'e': "+ str.replace('a','e'));

        //check the does the present string contains "string"
        System.out.println("word 'java' "+ str.contains("java"));

        //check the does the string start with "string"
        System.out.println("start with 'wel' : "+ str.startsWith("wel"));

        //check that does the string ends with "string"
        System.out.println("ends with 'java' : "+ str.endsWith("java"));

        //find the index of first occurance of "character"
        System.out.println("index of 'm': "+ str.indexOf('m'));

        //last index of "character"
        System.out.println("the last index of 'a': "+ str.lastIndexOf('a'));

        //check the equals between the two strings
        System.out.println("check 'hello java': "+ str.equals("hello java"));

        //check the equals between the two strings
        System.out.println("check 'WELCOME JAVA': "+ str.equalsIgnoreCase("WELCOME JAVA"));

        //check isEmpty
        System.out.println("check whether the string is empty or not: "+ str.isEmpty());

        //to split the strring
        String[] split=str.split("e");
        System.out.println("the splited strings parts : ");
        for(String parts:split){
            System.out.println(" "+parts);
        }
//        System.out.println(str.getClass().getSimpleName());

        // string to chararray
        char[] arr=str.toCharArray();
//        System.out.println(arr.getClass().getSimpleName());
        System.out.println("characters: ");
        for(char i:arr){
            System.out.println(i);
        }

        //concate the string
        System.out.println("adding the string to the given string ' programming: "+ str.concat(" programming"));

        // comparing the two string
        System.out.println("comparing the string 'JAVA' : "+ str.compareTo("JAVA"));



    }

}
