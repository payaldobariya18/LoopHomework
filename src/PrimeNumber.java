import java.util.Scanner;

public class PrimeNumber {
//write a java programme to check whether input number is prime or not.
public static void main(String[] args) {
    int n;
    int count = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter any number");
    n = scanner.nextInt();
    for (int i = 1; i <=n ; i++)//if the condition false then java compiler go out of for loop
    {
        if (n % i == 0) {
            count++;
        }
    }
       if (count==2)
       {

           System.out.println("Prime Number");
       }
       else
       {
           System.out.println("Not  Prime Number");
       }
    }



}











