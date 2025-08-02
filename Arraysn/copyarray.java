package Arraysn;
import java.util.Arrays;
import java.util.Scanner;

public class copyarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println( "enter the array:");
        int[] copyarr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("the original array is:"+ Arrays.toString(arr));
        for(int i=0;i<n;i++){
            copyarr[i]=arr[i];

        }
        System.out.println("copied array is:" + Arrays.toString(copyarr));

        //to print array manually without built-in function
//        for(int i=0;i<n;i++){
//            System.out.print(copyarr[i] + " ");
//        }
    }
}
