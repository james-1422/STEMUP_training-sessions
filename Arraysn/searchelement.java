import java.util.Scanner;

public class searchelement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        System.out.println("enter the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter the number to search");
        int search=sc.nextInt();
        boolean ans=false;
        for(int i=0;i<n;i++){
            if(arr[i]==search){
                System.out.println("the index of the searched element"+search+" is : "+ i);
                ans=true;
            }

        }
        if (ans!=true){
            System.out.println("the search element"+search+" is not present in the array");

        }
    }
}
