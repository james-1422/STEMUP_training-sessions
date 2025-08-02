import java.util.Arrays;
import java.util.Scanner;

public class printlengthofarray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        sc.nextLine();
        String[] fruits=new String[n];
        System.out.println("enter the fruits names: ");
        for(int i=0;i<n;i++){
            fruits[i]=sc.nextLine();
        }
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        System.out.println("enter the fruit name to search");
        String search=sc.nextLine();
        System.out.println( Arrays.binarySearch(fruits, search ));
    }
}
