import java.util.Scanner;

public class NumbersDivisibleby9 {
    // W.A.P to find out sum of numbers between a & b which are divisible by 9
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input starting and ending numbers from the user
        System.out.println("Enter the starting number (a): ");
        int a = scanner.nextInt();
        System.out.println("Enter the ending number (b): ");
        int b = scanner.nextInt();
        //initialize a variable to store the sum
        int sumofNumbers = 0;
        int count = 0;
        for (int i = a; i <= b ; i++)
        {
          if(i%9 == 0)
          {
           sumofNumbers=sumofNumbers+i;
           count++;
          }
        }
        System.out.println(" The sum of numbers between " + a + " and " + b + " that are divisible by 9 is : " + sumofNumbers);
        System.out.println(" The sum of numbers between " + a + " and " + b + " that are divisible by 9 is : " + count);
    }






}
