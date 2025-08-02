package TwoDarray;

import java.util.Scanner;

public class checkidentitymatrix {
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
        boolean ans=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j&& arr[i][j]==1){
                    ans=true;
                }
                if(i!=j&& arr[i][j]!=0){
                    ans=false;
                }
            }
        }
        if(!ans){
            System.out.println("it is not a identity matrix");
        }
        else{
            System.out.println("it is a identity matrix");
        }
    }
}
