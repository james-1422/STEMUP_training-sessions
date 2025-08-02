package HW.AUGUST01.programs;

import java.util.LinkedList;
import java.util.Scanner;

public class FactorialofeachelementinLL {
    public static void main(String[] args) {
        System.out.println("output bY JAMES J");
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length linked list: ");
        int n = sc.nextInt();
        System.out.println("enter the " + n + " nos: ");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }
        System.out.println(list);
        int sum=0;
        //TRAVERSAL
        for (int i : list) {
            int value = i;
            int result = 1;
            while (value > 0) {
                result = result * value;
                value--;
            }
            System.out.println("the factorial of" + i + " is: " + result);
            sum+=result;
        }
        System.out.println("the total of given" +n+" nos after is factorial: " +sum);
    }
}
