package javatask1;
import java.util.Scanner;
//addition of two numbers using command line arguments
public class AddNumbersAlt {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;

        try {
            if (args.length >= 2) {
                num1 = Integer.parseInt(args[0]);
                num2 = Integer.parseInt(args[1]);
            } else {
               
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter first number: ");
                num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                num2 = sc.nextInt();
                sc.close();
            }

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }
    }
}