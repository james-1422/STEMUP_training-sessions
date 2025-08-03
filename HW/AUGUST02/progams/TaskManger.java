package HW.AUGUST02.progams;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class TaskManger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int choice;
        TaskManger run=new TaskManger();
        do {
            System.out.println("-----OUTPUT BY JAMES J-----");
            System.out.println("-----TASK MANAGER-----");
            System.out.println("1. Add the Task to the list of Task");
            System.out.println("2. Remove the Task from the list which is done or not requried");
            System.out.println("3. Modify the task list by replacing the task");
            System.out.println("4. show the list of Tasks stored");
            System.out.println("5. EXIT");
            System.out.println(" enter your choice: ");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    run.Add_Tasks(sc);
                    break;
                case 2:
                    run.Remove_Task(sc);
                    break;
                case 3:
                    run.Modify_Tasks(sc);
                    break;
                case 4:
                    run.Print_Tasks_List(sc);
                    break;
                case 5:
                    System.out.println("THANK YOU USING THE TASK LIST");
                    break;
                default:
                    System.out.println("YOUR ENTERED CHOICE ID INVALID!!!🤦‍♂️");
            }
        }while (choice<=5);
    }
    public void Add_Tasks(Scanner sc){
        System.out.println();
        System.out.println("enter the no of tasks u are going to add: ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the tasks that should be stored in the list of tasks");
        for(int i=0;i<n;i++){
            String tasks=sc.nextLine();
            listOfTasks.add(tasks);
        }
        System.out.println(listOfTasks);
        if(!listOfTasks.isEmpty()){
            System.out.println("the number of task is added to the list successfully👍👍");
        }
        System.out.println("-----OUTPUT BY JAMES J-----");
        System.out.println();
    }
    public void Remove_Task(Scanner sc){
        System.out.println();
        System.out.println(listOfTasks);
        System.out.println("enter the no of task to be remove in the list: ");
        int n=sc.nextInt();
        System.out.println("the "+n+" task is removed: "+listOfTasks.remove(n-1));
        System.out.println("list after removed the "+n+" task of the list:\n "+ listOfTasks);
        System.out.println("-----OUTPUT BY JAMES J-----");
        System.out.println();
    }
    public void Modify_Tasks(Scanner sc){
        System.out.println();
        System.out.println(listOfTasks);
        if(listOfTasks.isEmpty()){
            System.out.println("cannot perform this modifying operation");
            return;
        }
        System.out.println("enter the  index at which the task should be replaced in the list: ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the string to replace");
        String newtask=sc.nextLine();
        System.out.println("task at n :: "+ listOfTasks.get(n-1)+" -> "+listOfTasks.set(n-1,newtask));
        System.out.println("the list after modifying the  tasks of the list:  "+ listOfTasks);
        System.out.println("-----OUTPUT BY JAMES J-----");
        System.out.println();
    }
    public void Print_Tasks_List(Scanner sc){
        System.out.println();
        System.out.println("---- the tasks are-----");
        if(!listOfTasks.isEmpty()){
            for (String ch:listOfTasks){
                System.out.println(ch);
            }
        }
        else{
            System.out.println("the list of tasks is empty");
        }

        System.out.println("-----OUTPUT BY JAMES J-----");
        System.out.println();
    }
    LinkedList<String> listOfTasks=new LinkedList<>();
}
