package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
//        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(arr));
//        }

    }
}
