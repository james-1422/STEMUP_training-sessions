import java.util.Arrays;
import java.util.Scanner;

public class reversestringarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        sc.nextLine();
        String[] fruits=new String[n];
        for(int i=0;i<n;i++){
            fruits[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(fruits));
        for(int i=n-1;i>=0;i--){
            System.out.print(fruits[i] + " ");
        }
    }
}
