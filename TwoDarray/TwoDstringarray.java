package TwoDarray;

import java.util.Scanner;

public class TwoDstringarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimension of array");
        int n=sc.nextInt();
        System.out.println("enter the string array: ");
        String[][] arr=new String[n][n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+ " ");
            System.out.println();
        }

    }
}
