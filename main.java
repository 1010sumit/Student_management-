import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    private static final ArrayList<student_project> students = new ArrayList<>();

    private static void addStudent(Scanner sc) {
        System.out.println("Enter the name of Student:");
        String name = sc.nextLine();

        System.out.println("Enter the email of Student:");
        String email = sc.nextLine();

        while (!isValidEmail(email)) {
            System.out.println("Wrong Email, try again:");
            email = sc.nextLine();
        }

        System.out.println("Enter the GPA of Student:");
        double GPA = sc.nextDouble();

        System.out.println("Enter the ID of Student:");
        int ID = sc.nextInt();

        System.out.println("Enter the age of Student:");
        int age = sc.nextInt();
        sc.nextLine();

        student_project s1 = new student_project(name, email, GPA, ID, age);
        students.add(s1);
        System.out.println("Student data added successfully..");
    }

    private static boolean isValidEmail(String email) {
        String regex = "[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+\\.[A-Za-z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static void viewStudent() {
        for (student_project student : students) {
            System.out.println(student);
        }
    }

    private static void searchStudent(Scanner sc) {
        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();

        boolean found = false;
        for (student_project student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    private static void sortStudent(Scanner sc) {
        System.out.println("Enter the field to sort by (name, email, ID, GPA, or age):");
        String field = sc.nextLine();
        Collections.sort(students, new student_projectComparator(field));

        for (student_project student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command (add, view, search, sort, exit):");
            String command = sc.nextLine();

            switch (command) {
                case "add":
                    addStudent(sc);
                    break;
                case "view":
                    viewStudent();
                    break;
                case "search":
                    searchStudent(sc);
                    break;
                case "sort":
                    sortStudent(sc);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}

