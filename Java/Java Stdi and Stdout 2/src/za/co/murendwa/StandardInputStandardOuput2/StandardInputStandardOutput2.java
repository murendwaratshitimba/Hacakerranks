/**
 * Hackerrank problem #4: Stdin and Stdout 2
 */

package za.co.murendwa.StandardInputStandardOuput2;
import java.util.Scanner;

/**
 * StandardInputOutput2 class
 */
public class StandardInputStandardOutput2 {

    /**
     * main method
     * @param args is a string array
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get the integer
        int integer = input.nextInt();

        // get the double
        double decimal = input.nextDouble();

        // read the new line character
        input.nextLine();

        // then read the string
        String string = input.nextLine();

        // display the attributes

        System.out.println("String: " + string);
        System.out.println("Double: " + decimal);
        System.out.println("Int: " + integer);
    }
}
