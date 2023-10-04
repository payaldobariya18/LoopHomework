import java.util.Scanner;

public class CountChar {
    //W.A.P to enter any string and count total number of 'a' in that string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");//input a string from the user
        String sentence = scanner.nextLine();
        int countA = 0;// initialize a variable to count the 'a' characters
        sentence =sentence.toLowerCase();//convert the input string to lowercase to make it case-insensitive

        for (int i = 0; i <sentence.length() ; i++)
        { char currentChar = sentence.charAt(i);
            if (currentChar == 'a')//check if the character is 'a'
            {
                countA++;

            }

        }
        System.out.println("total number of 'a' in the string: " + countA);
    }












}
