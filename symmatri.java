import java.util.Scanner;

class symmatri{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

    System.out.println("ENter No of rows :");
    int rows=sc.nextInt();
    System.out.println("ENter no of colums : ");
    int cols=sc.nextInt();

    int matrix[][]=new int [rows][cols];

    if(rows!=cols){
        System.out.println("Not a symmatric matrix");
        return;
    }

    }
}