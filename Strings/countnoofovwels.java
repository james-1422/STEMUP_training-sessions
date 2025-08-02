package Strings;

import java.util.Scanner;

public class countnoofovwels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=sc.nextLine();
        int vowels=0;
        int consonant=0;
        if(!str.isEmpty()){
            for (int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1){
                    vowels++;

                }
                else{
                    consonant++;
                }
                }
            }
            System.out.println("no of vowels: "+ vowels+"  \n no of consonants: "+consonant);
        }
    }
}
