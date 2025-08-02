import java.util.Arrays;
import java.util.Scanner;

public class mergearray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first array lrngth");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        System.out.println("enter the array1");
        for (int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("first array :" + Arrays.toString(arr1));

        System.out.println("enter the secnd array lrngth");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        System.out.println("enter the array 2");
        for (int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("second array :" + Arrays.toString(arr2));

        int m=n1+n2;
        int[] mergearr=new int[m];
        for(int i=0;i<n1;i++){
            mergearr[i]=arr1[i];
        }
        for(int i=0;i<n2;i++){
            mergearr[n1+i]=arr2[i];
        }

        System.out.println("second array :" + Arrays.toString(mergearr));

    }

}
