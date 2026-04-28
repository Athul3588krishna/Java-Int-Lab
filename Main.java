import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;
}

public class Main {
    public static void Employee(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee emp[] = new Employee[n];

        // Input
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();

            System.out.print("Enter eNo: ");
            emp[i].eNo = sc.nextInt();

            System.out.print("Enter eName: ");
            emp[i].eName = sc.next();

            System.out.print("Enter eSalary: ");
            emp[i].eSalary = sc.nextDouble();
        }

        // Search
        System.out.print("Enter eNo to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == key) {
                System.out.println("Employee Found:");
                System.out.println(emp[i].eNo + " " + emp[i].eName + " " + emp[i].eSalary);
                return;
            }
        }

        System.out.println("Employee not found");
    }
}