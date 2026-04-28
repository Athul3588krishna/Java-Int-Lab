import java.util.Scanner;

// Student class
class Student {
    int marks;

    void getMarks(int m) {
        marks = m;
    }
}

// Sports interface
interface Sports {
    void getScore(int s);
}

// Result class
class Result extends Student implements Sports {

    int score;

    // implementing interface method
    public void getScore(int s) {
        score = s;
    }

    void display() {
        System.out.println("Academic Marks: " + marks);
        System.out.println("Sports Marks: " + score);
    }
}

// Main class
public class Multiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Academic Marks: ");
        int m = sc.nextInt();

        System.out.print("Enter Sports Marks: ");
        int s = sc.nextInt();

        r.getMarks(m);
        r.getScore(s);

        r.display();
    }
}