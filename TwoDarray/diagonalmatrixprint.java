package TwoDarray;

import java.util.Scanner;

public class diagonalmatrixprint {
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
        System.out.println("the diagonal elements of matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1) {
                    System.out.print(arr[i][j] + " ");
                }
                else {
                    int a=0;
                    System.out.print(a+" ");
                }
            }
            System.out.println();
        }
    }
    }

