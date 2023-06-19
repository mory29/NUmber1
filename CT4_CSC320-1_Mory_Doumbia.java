/*Name: Mory Doumbia
* Class: CSC320-1
* Instructor: Douglas Mujeye*/

import java.util.Scanner;

public class FiveFloating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        int count = 0;
        Double minimum = null;
        Double maximum = null;

        while (count < 5) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();

                // update total and count
                total += value;
                count++;

                // update minimum and maximum
                if (minimum == null || value < minimum) {
                    minimum = value;
                }
                if (maximum == null || value > maximum) {
                    maximum = value;
                }
            } else {
                System.out.println("Invalid input, please enter a valid floating-point value.");
                scanner.next(); // consume invalid input
            }
        }

        // calculate average
        double average = total / count;

        // calculate interest on total
        double interest = 0.2 * total;

        // print results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
    }
}
