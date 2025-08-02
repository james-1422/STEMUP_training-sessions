import java.util.Scanner;

public class noofevenodd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even+=1;

            }
            else{
                odd+=1;
            }
        }
        System.out.println("the no of even no in an array is: "+ even);
        System.out.println("the no of odd no in an array is: "+ odd);


    }

}
