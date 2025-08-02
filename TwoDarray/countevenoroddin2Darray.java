package TwoDarray;

import java.util.Scanner;

public class countevenoroddin2Darray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimension of array");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("enter the array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the array is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("the no of evens in the array is: "+even + "\n the no of odd in the array is: "+odd);
    }
}
