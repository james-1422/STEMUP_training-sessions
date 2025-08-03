package HW.AUGUST02.programs;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement run = new StudentManagement();
        int choice;
        do {
            System.out.println("-----OUTPUT BY JAMES J-----");
            System.out.println("-----STUDENT MANAGEMENT SYSTEM-----");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. List Students");
            System.out.println("4. Modify Details");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    run.addStudent(sc);
                    break;
                case 2:
                    run.removeStudent(sc);
                    break;
                case 3:
                    run.listStudents();
                    break;
                case 4:
                    run.modifyStudent(sc);
                    break;
                case 5:
                    run.searchStudent(sc);
                    break;
                case 6:
                    System.out.println("THANK YOU FOR USING STUDENT MANAGEMENT SYSTEM");
                    break;
                default:
                    System.out.println("INVALID CHOICE. PLEASE TRY AGAIN.");
            }

            System.out.println();
        } while (choice <= 6);
    }

    public void addStudent(Scanner sc) {
        System.out.print("Enter number of students to add: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            String student = sc.nextLine();
            studentlist.add(student);
        }
        System.out.println("Students added successfully.");
        System.out.println("-----OUTPUT BY JAMES J-----");
        System.out.println();
    }

    public void removeStudent(Scanner sc) {
        if (studentlist.isEmpty()) {
            System.out.println("List is empty. Nothing to remove.");
            return;
        }
        System.out.println(studentlist);
        System.out.print("Enter index (1-based) of student to remove: ");
        int index = sc.nextInt();
        if (index < 1 || index > studentlist.size()) {
            System.out.println("Invalid index.");
            return;
        }

        String removed = studentlist.remove(index - 1);
        System.out.println("Removed student: " + removed);
        System.out.println("-----OUTPUT BY JAMES J-----");
        System.out.println();
    }

    public void listStudents() {
        if (studentlist.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("----- Student List -----");
            for (String student : studentlist) {
                System.out.println(student);
            }
        }
        System.out.println("-----OUTPUT BY JAMES J-----");
        System.out.println();
    }

    public void modifyStudent(Scanner sc) {
        if (studentlist.isEmpty()) {
            System.out.println("List is empty. Nothing to modify.");
            return;
        }
        System.out.println(studentlist);
        System.out.print("Enter index (1-based) of student to modify: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index < 1 || index > studentlist.size()) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.print("Enter new name for student: ");
        String newName = sc.nextLine();
        studentlist.set(index - 1, newName);
        System.out.println("Student updated successfully.");
        System.out.println("list of student after modifying the list: "+studentlist);
        System.out.println("-----OUTPUT BY JAMES J-----");
        System.out.println();
    }

    public void searchStudent(Scanner sc) {
        if (studentlist.isEmpty()) {
            System.out.println("Student list is empty.");
            return;
        }
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (String student : studentlist) {
            if (student.equalsIgnoreCase(name)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student found in the list at index: "+studentlist.indexOf(name));
        } else {
            System.out.println("Student not found.");
        }
        System.out.println("-----OUTPUT BY JAMES J-----");
        System.out.println();
    }
    LinkedList<String> studentlist = new LinkedList<>();
}
