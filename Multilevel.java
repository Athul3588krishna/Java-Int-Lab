import java.util.Scanner;

// Parent class
class Publisher {
    String publisherName;

    void getPublisher(String name) {
        publisherName = name;
    }
}

// Child class
class Book extends Publisher {
    String title;
    String author;

    void getBook(String t, String a) {
        title = t;
        author = a;
    }
}

// Literature class
class Literature extends Book {

    void display() {
        System.out.println("\n--- Literature Book ---");
        System.out.println("Publisher: " + publisherName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Fiction class
class Fiction extends Book {

    void display() {
        System.out.println("\n--- Fiction Book ---");
        System.out.println("Publisher: " + publisherName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Main class
public class Multilevel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Publisher Name: ");
        String pub = sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Category (1-Literature, 2-Fiction): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            Literature l = new Literature();
            l.getPublisher(pub);
            l.getBook(title, author);
            l.display();
        } else {
            Fiction f = new Fiction();
            f.getPublisher(pub);
            f.getBook(title, author);
            f.display();
        }
    }
}