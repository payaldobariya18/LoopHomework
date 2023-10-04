import java.util.Scanner;

public class fibonaccinumber {
    //print the sequence 1 1 2 3 5 8 13 21(Fibonacci number)-limitation is n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; // creat object
        System.out.println("Please enter fibolength");
        int fibolength = scanner.nextInt();
        int a=1;
        int b=1;
        int c;
        for (int i = 1; i <=fibolength ; i++)
        {
            System.out.print(a + " ");
                c = a+b;
                a=b; // b value assigned to a
                b=c; // c value assigned to b

        }








       // / System.out.print(n1 + " ");
       // System.out.print(n2 + " ");;//printing 0 and 1
       // for (int i = 2; i <fibolengh ; i++) //loop starts from 2 b'coz 0 and 1 is prented
      //






    }







}
