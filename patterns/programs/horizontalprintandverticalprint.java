package patterns.programs;

import java.util.Scanner;

public class horizontalprintandverticalprint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of stars to be printed horizontali");
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            System.out.print("* ");
            i++;
        }
        System.out.println();
        System.out.println("printing star in vertical:");
int j=0;
        while(j<n){
            System.out.println("* ");
            j++;
        }
    }
}
