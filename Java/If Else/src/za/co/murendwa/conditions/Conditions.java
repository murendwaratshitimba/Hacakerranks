/**
 * Hackerrank problem #3: If else
 */

package za.co.murendwa.conditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditions {

    /**
     * Main method
     * @param args string array
     * @throws IOException an exception thrown when an error is raised
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int integer = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        // display text
        process(integer);
    }


    /**
     * Process the integer and display text best on the condition met
     * @param integer is the integer provided by the user
     */
    public static void process(int integer) {

        if ((integer % 2 == 0) && ((integer >= 2 && integer <= 5) || integer > 20)) {

            System.out.println("Not Weird");

        } else {

            System.out.println("Weird");
        }
    }
}


