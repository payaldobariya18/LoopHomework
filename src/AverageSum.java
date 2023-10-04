import java.util.Scanner;

public class AverageSum {
    //w.a.p to find average and sum of two numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter startig number (a): ");
        int a = scanner.nextInt();
        System.out.println("Enter ending number (b) : ");
        int b = scanner.nextInt();
        int sum = 0;//initialize variable to store sum
        int count = 0;
        double average;
        for (int i = a; i < b; i++)
        {
            //System.out.println(i);
            sum = sum+i;

            count++;
        }
        average = sum/count;
        System.out.println("The sum of numbers between  " + a + " and " + b + " = " + sum);
        System.out.println("The average of numbers between " + a + " and " + b + " = " + average);


    }





}
