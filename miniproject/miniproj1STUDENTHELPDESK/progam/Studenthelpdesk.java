package miniproject.miniproj1STUDENTHELPDESK.progam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Studenthelpdesk {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        Studenthelpdesk run=new Studenthelpdesk();
        System.out.println("OUTPUT BY JAMES J");
        System.out.println("//---- Student Help Desk----\\");
        System.out.println("--check the operation done and select your choice: ");
        do {
            System.out.println("1.submit a query");
            System.out.println("2.view and resolve next query");
            System.out.println("3.view recent keyword");
            System.out.println("4.undo last keyword");
            System.out.println("5.add an FAQs");
            System.out.println("6.view all the FAQs");
            System.out.println("7.remove an FAQs");
            System.out.println("8.exit");
            System.out.println();
            System.out.println("enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    run.Submitquery(sc);
                    break;
                case 2:
                    run.View_resolvequery(sc);
                    break;
                case 3:
                    run.View_recentkeyword(sc);
                    break;
                case 4:
                    run.Undolastkeyword(sc);
                    break;
                case 5:
                     run.AddFAQs(sc);
                    break;
                case 6:
                    run.ViewFAQs(sc);
                    break;
                case 7:
                    run.RemoveFAQs(sc);
                    break;
                case 8:
                    System.out.println("THANK YOU FOR USING");
                    break;
                default:
                    System.out.println("enter the valid choice: TRY AGAIN!!🥱🥱🥱");


            }
        }while (choice!=9);


    }
    public void Submitquery(Scanner sc){
        System.out.println("OUTPUT BY JAMES J");

        sc.nextLine();
        System.out.println("enter your name: ");
        String name=sc.nextLine();
        System.out.println("enter your valid email-id: ");
        String email=sc.nextLine();

        if(!email.contains("@")||!email.endsWith("gmail.com")){
            System.out.println("your email-id is not valid🤦‍♂️");
            System.out.println();
            return;
        }
        System.out.println("enter your query: ");
        String query=sc.nextLine();
        Queries[querycout++] =query;
        listofQueries.offer("name: "+ name+ " , email-id: "+ email+" , Query: " +query);
        System.out.println(listofQueries);
        String[] arr=query.split(" ");
        for(String ch:arr){
            keywordstack.push(ch.toLowerCase());
        }
        System.out.println(keywordstack);
        System.out.println("the Query is subbmitted successfully👍");
        System.out.println("\n");

    }

    public void View_resolvequery(Scanner sc){
        System.out.println("OUTPUT BY JAMES J");

        if(!listofQueries.isEmpty()){
            String queryresolved=listofQueries.poll();
            System.out.println("the query resolved successfully: "+ queryresolved);
            System.out.println("\n");
        }
        else{
            System.out.println("there are no queries to resolve ");
            System.out.println("\n");
        }
    }
    public void View_recentkeyword(Scanner sc){
        System.out.println("OUTPUT BY JAMES J");

        if(!keywordstack.isEmpty()){
            System.out.println("the recent viewed keyword is: "+ keywordstack.peek());
            System.out.println("\n");
        }
        else{
            System.out.println("nothing present in the keyword as the recent in stack");
            System.out.println("\n");
        }

    }
    public void Undolastkeyword(Scanner sc){
        System.out.println("OUTPUT BY JAMES J");

        if(!keywordstack.isEmpty()){
            System.out.println("the preview keyword or last keyword undoing: "+ keywordstack.pop());
            System.out.println("\n");
        }
        else {
            System.out.println("there is no keyword to undo it");
            System.out.println("\n");
        }
    }
    public void AddFAQs(Scanner sc){
        System.out.println("OUTPUT BY JAMES J");

        System.out.println("enter the no of FAQs u are going to enter:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the FAQs:");
        for(int i=0; i<n;i++) {
            String urquestion = sc.nextLine();
            FAQslist.add(urquestion);
        }
        System.out.println("the FAQs u enter id added to the list of FAQs: "+ FAQslist);
        System.out.println("\n");
    }
    public void ViewFAQs(Scanner sc){
        System.out.println("OUTPUT BY JAMES J");

        System.out.println("\n");
        if (!FAQslist.isEmpty()){
            System.out.println("-----THE FAQs ARE------");
            for (String ch:FAQslist){
                System.out.println(" "+ch);
            }
        }
        else{
            System.out.println("there are no FAQs presently stored");
            System.out.println("\n");
        }
    }
    public void RemoveFAQs(Scanner sc){
        System.out.println("OUTPUT BY JAMES J");

        System.out.println("enter the index value of te FAQs must be removed: ");
        int n=sc.nextInt();
        if(!FAQslist.isEmpty()){
            System.out.println("  the FAQs are removed: "+ FAQslist.remove(n));
        }
        else{
            System.out.println("FAQs are not found!");
        }
    }
    Stack<String> keywordstack=new Stack<>();
    String[] Queries=new String[200];
    int querycout=0;
    Queue<String> listofQueries= new LinkedList<>();
    LinkedList<String> FAQslist=new LinkedList<>();

}
