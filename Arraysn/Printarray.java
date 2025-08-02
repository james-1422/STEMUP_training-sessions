public class Printarray {
    public static void main(String[] args){
        int[] arr={1,2,3,8,7,9,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");//printing the array
        }
        System.out.println();
        String[] fruits={"apple","ball","cat"};//initializing the array
        int len=0;
        for(int i=0;i<fruits.length;i++){
            System.out.print(fruits[i]+" ");
            len+=i;
        }
        System.out.println(arr.length+" length of int array  " + len +"  length of String array  " );
    }
}
