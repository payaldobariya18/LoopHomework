import java.util.Scanner;

public class NaturalNumber {
    //W.A.P to display sum of natural number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of term ");
        int n = scanner.nextInt();
        int sum = 0;//in adition the value remain same
        for (int i = 1; i <=n ; i++)
        {
             sum=sum+i;   //logic for sum of natural numbers
        }
        System.out.println("ADITION " + sum);//when condition falls the javacompiler comes out
                                             //from the loop here
    }


}
