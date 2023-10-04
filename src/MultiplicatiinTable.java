import java.util.Scanner;

public class MultiplicatiinTable {
    //W.A.P to print multiplication table for any number
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = scanner.nextInt();

        for (int i =1; i<=10; i++)
        {
                System.out.println(n + " x " + i + " = " + (n*i));//1 x 1 = 1
        }
        }



    }









