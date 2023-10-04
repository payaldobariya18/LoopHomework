import java.util.Scanner;

public class MinMaxNumber {
    //W.A.P to find min & max number from 3 numbers which user enters
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        double num1  = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextInt();
        double min,max ;
        // find maximum number
        if (num1>=num2 && num1>=num3)
        {
            max = num1;
        }else if(num2>=num1 && num2>=num3)
        {
            max = num2;
        }else
        {
            max = num3;
        }
        //find minimum number
        if(num1<=num2 && num1<=num3)
        {
          min = num1;
        }else if (num2<=num3)
        {
            min = num2;
        }else
        {
            min = num3;

        }
        System.out.println("Maximum number: " + max);
        System.out.println("minimum number: " + min);



    }


}
