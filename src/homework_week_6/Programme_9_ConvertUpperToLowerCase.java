package homework_week_6;

import java.util.Scanner;

public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUpperCaseToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }
    //Conversion of Uppercase to Lower case method
    public void convertUpperCaseToLowerCase(String text){
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
