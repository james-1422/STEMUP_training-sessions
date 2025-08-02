package HW.july31;

import java.util.Scanner;

public class Maxelementinrow {
    public static void main(String[] args){
        System.out.println("output by JAMES J");
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
        for(int i=0;i<n;i++){
            int max=arr[i][0];
            for(int j=0;j<n;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }

            }
            System.out.println("ROW= "+i+" element is: "+max);
        }
    }
}
