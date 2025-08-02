package LinkedList;

import java.util.LinkedList;

public class findmiddleelement {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        for (int i=1;i<=7;i++){
            list.add(i);
        }
        int slow=0;
        int fast=0;
        while(fast<list.size()-1 && fast+1<list.size()-1){
            slow++;
            fast+=2;
        }
        System.out.println("the middle element is: "+list.get(slow));
    }
}
