/**
 * Hackerrank problem #2: Java Stdin and Stdout 1
 */

package za.co.murendwa.solution;
import java.util.Scanner;

/**
 * program that allows the user to enter three integers,
 * then display each integer on a new line
 */
public class StandardInputStandardOut1 {


    public static void main (String[] args) {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get three integers from the user
        int integer1 = input.nextInt();
        int integer2 = input.nextInt();
        int integer3 = input.nextInt();

        // display all three integers
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
    }
}
