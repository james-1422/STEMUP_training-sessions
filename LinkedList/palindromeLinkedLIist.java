package LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class palindromeLinkedLIist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 2, 1));
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(50);
//        list.add(0);
        System.out.println(list);

        boolean ispalin = true;
        int n = list.size() - 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (!list.get(i).equals(list.get(n - i))) {
                ispalin = false;
            }
        }
        System.out.println(list + " is palindrome: " + ispalin);

    }

}
