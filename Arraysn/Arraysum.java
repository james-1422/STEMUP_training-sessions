package Arraysn;
import java.util.Scanner;

public class Arraysum {
    public int sum(int[] arr, int n){
        int total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        return total;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        Arraysum sol=new Arraysum();
        int ans=sol.sum(arr,n);
        System.out.println("the sum of the given array is: " + ans);
    }
}
