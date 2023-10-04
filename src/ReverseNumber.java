import java.util.Scanner;

public class ReverseNumber {
// W.A.P for reverse number
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = scanner.nextInt();
    int r;
    int sum = 0;
    for (int i = n; i >0; )
    {
             r = i % 10; //logic
             sum = sum * 10 + r;//also logic for reverse number
             i = i/10;

    }
       System.out.println(sum);
}
}
