import java.util.Scanner;

public class CalculatorSwitch
{ //W.A.p to make calculator using switch
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//creat an object for scanner class
        System.out.println("Please emter two numbers");//ask user to enter number
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Select an operator; +,-,*;/,%");//ask user to enter operator
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Adition of " + a + " and " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println("Substraction of " + a + " and " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of " + a + " and " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println("Division of " + a + " and " + b + " = " + (a / b));
                break;
            case '%':
                System.out.println("Modulus of " + b + " and " + a + " = " + (b%a));
                break;
            default:
                System.out.println("Invalid operator");
                break;

        }







    }
}
