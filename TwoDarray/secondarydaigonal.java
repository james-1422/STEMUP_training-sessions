package TwoDarray;

import java.util.Scanner;

public class secondarydaigonal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimension of array: ");
        int n=sc.nextInt();
        System.out.println("enter the array:");
        int[][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the secondary diagonal elements of matrix: ");
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i+j;j--){

                    System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
