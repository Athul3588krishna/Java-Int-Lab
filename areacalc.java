import java.util.Scanner;

class Area {

    void area(int r) {
        double result = Math.PI * r * r;
        System.out.println("Area of Circle: " + result);
    }

    void area(int l, int b) {
        int result = l * b;
        System.out.println("Area of Rectangle: " + result);
    }

    void area(double b, double h) {
        double result = 0.5 * b * h;
        System.out.println("Area of Triangle: " + result);
    }
}

public class areacalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter radius: ");
                int r = sc.nextInt();
                obj.area(r);
                break;

            case 2:
                System.out.print("Enter length: ");
                int l = sc.nextInt();
                System.out.print("Enter breadth: ");
                int b = sc.nextInt();
                obj.area(l, b);
                break;

            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                obj.area(base, h);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}