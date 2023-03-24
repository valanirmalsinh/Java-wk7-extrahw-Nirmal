package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme_19_ConvertStringToLowerCase {

    public static void main(String[] args) {
        //Scanner Declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper case sentence :");
        String uppercase = scanner.nextLine();
        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToTheLowerCase(uppercase);
        //Closing the scanner
        scanner.close();
    }
    //Convert String to the Lower Case
    public void convertStringToTheLowerCase(String str){
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}
