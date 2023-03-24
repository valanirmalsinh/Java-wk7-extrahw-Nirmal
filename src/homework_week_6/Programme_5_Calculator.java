package homework_week_6;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication, and division
 * methods all with parameters and use string concatenation methods.
 * (Note: two instance and two static methods.)
 */
public class Programme_5_Calculator {
    //static methods
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is: " + result);
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    //instance methods

    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is : " + result);
    }

    public int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = scan.nextInt();
        System.out.println("Please enter second number: ");
        int b = scan.nextInt();

        addition(a, b);

        int sunResult = subtraction(a, b);
        System.out.println("The subtraction of " + a + " and " + b + " is : " + sunResult);

        Programme_5_Calculator obj = new Programme_5_Calculator();
        obj.multiplication(a, b);

        int divResult = obj.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divResult);

        //closing the scanner object
        scan.close();

    }
}
