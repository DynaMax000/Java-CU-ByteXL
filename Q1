import java.io.*;
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("employees.txt");

        while (true) {
            System.out.println("\n1. Add Employee\n2. Show Employees\n3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("ID: ");
                String id = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Designation: ");
                String desig = sc.nextLine();
                System.out.print("Salary: ");
                String salary = sc.nextLine();

                try (FileWriter fw = new FileWriter(file, true)) {
                    fw.write(id + "," + name + "," + desig + "," + salary + "\n");
                }
                System.out.println("Employee saved.");

            } else if (choice == 2) {
                if (!file.exists()) {
                    System.out.println("No records found.");
                    continue;
                }

                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    System.out.println("\n--- Employee List ---");
                    while ((line = br.readLine()) != null) {
                        String[] e = line.split(",");
                        System.out.println("ID: " + e[0] + ", Name: " + e[1] + ", Designation: " + e[2] + ", Salary: " + e[3]);
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
                sc.close();
            }
        }
    }
}
