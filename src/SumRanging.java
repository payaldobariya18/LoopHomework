public class SumRanging {
        //W.A.p to prints the sum of x ranging from 1 to 20.
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 20; i++)
            {
                System.out.println(i);
                sum = sum + i;
            }
            System.out.println("Sum of  given range is " + sum);
        }
}
