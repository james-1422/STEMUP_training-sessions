package Arraysn;
import java.util.Arrays;
public class Arraydemo {
    public static void main(String[] args){
        int[] arr={1,2,3,8,7,9,5};
        //print original array
        System.out.println("original array:"+ Arrays.toString(arr));
        System.out.println(arr.getClass().getSimpleName());// to print it type

        //sorting array
        Arrays.sort(arr);
        System.out.println("sorted array:"+ Arrays.toString(arr));


        //binary search of array-- for binary search the array must be sorted
        int index=Arrays.binarySearch(arr,8);
        System.out.println("index of element 8: " + index);


        //copyOf method
        int[] copy=Arrays.copyOf(arr,8);
        System.out.println("copied array with new length: " + Arrays.toString(copy));

        //copy of range
        int[] rangecopy=Arrays.copyOfRange(arr,1,5);
        System.out.println("range of copied array: " + Arrays.toString(rangecopy));

        //equals check
        int[]  newarr={1,3,5,7,8,9,};
        boolean arrcheck=Arrays.equals(arr,newarr);
        System.out.println("the two arrays are equal: " + arrcheck);

        //fill method
        int[] fillarr=new int[7];
        Arrays.fill(fillarr,14);
        System.out.println("fill the array with 14: " + Arrays.toString(fillarr));

        //setall method-> sets the each value based on lambda
        Arrays.setAll(fillarr,i->i*i);
        System.out.println("after setall with square of index: " + Arrays.toString(fillarr));

        //hashcode method
        int hash=Arrays.hashCode(arr);
        System.out.println("hash code of the arr array: "+ hash);

        //mismatch method
        int missedindex=Arrays.mismatch(arr, newarr);
        System.out.println("first mismatch index between arr and new arr: "+ missedindex);

        //parallel sort
        int[] largearr={9,8,5,5,6,2,1,3,7,4};
        Arrays.parallelSort(largearr);
        System.out.println("parallel sorted array: "+ Arrays.toString(largearr));


    }
}
