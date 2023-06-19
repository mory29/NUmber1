import java.util.Scanner;

public class CarMPG {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for car details
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car year: ");
        int year = scanner.nextInt();
        System.out.print("Enter starting odometer reading: ");
        double startOdometer = scanner.nextDouble();
        System.out.print("Enter ending odometer reading: ");
        double endOdometer = scanner.nextDouble();
        System.out.print("Enter gallons used: ");
        double gallonsUsed = scanner.nextDouble();

        // Calculating miles per gallon
        double milesDriven = endOdometer - startOdometer;
        double mpg = milesDriven / gallonsUsed;

        // Printing the output with labels
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Starting Odometer Reading: " + startOdometer);
        System.out.println("Ending Odometer Reading: " + endOdometer);
        System.out.println("Gallons Used: " + gallonsUsed);
        System.out.println("MPG: " + mpg);
    }
}
