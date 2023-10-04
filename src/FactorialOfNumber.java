import java.util.Scanner;

public class FactorialOfNumber{
 //W.A.P for factorial of a number
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter any number");
     int n = scanner.nextInt();
     int fact = 1; //in multiplication to make the value same it always assined value 1 not 0
     for (int i = 1; i <=n ; i++) //in factorial it go to 1 so i=1
     {
               fact=fact*i;     // logic for finding factorial of a number
     }
     System.out.print("Factorial  " + fact);










 }


}
