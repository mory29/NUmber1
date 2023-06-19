import java.util.ArrayList;
import java.util.Scanner;

public class TemperatureTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daysOfWeek = new ArrayList<String>();
        ArrayList<Double> temperatures = new ArrayList<Double>();

        // Populate the ArrayLists with data
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        temperatures.add(78.0);
        temperatures.add(80.5);
        temperatures.add(82.0);
        temperatures.add(85.5);
        temperatures.add(83.0);
        temperatures.add(80.5);
        temperatures.add(79.0);

        System.out.println("Enter a day of the week (Monday through Sunday) or 'week' to see the weekly average:");
        String userInput = input.nextLine();

        if (userInput.equalsIgnoreCase("week")) {
            double totalTemperature = 0.0;
            for (int i = 0; i < temperatures.size(); i++) {
                System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i));
                totalTemperature += temperatures.get(i);
            }
            double weeklyAverage = totalTemperature / temperatures.size();
            System.out.println("Weekly average temperature: " + weeklyAverage);
        } else {
            boolean foundDay = false;
            for (int i = 0; i < daysOfWeek.size(); i++) {
                if (userInput.equalsIgnoreCase(daysOfWeek.get(i))) {
                    System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i));
                    foundDay = true;
                    break;
                }
            }
            if (!foundDay) {
                System.out.println("Invalid day entered.");
            }
        }
    }
}