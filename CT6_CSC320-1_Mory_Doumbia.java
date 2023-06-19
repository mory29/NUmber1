import java.util.Scanner;

public class InputValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        validateInput(scanner);
    }

    public static String validateInput(Scanner scanner) {
        String input1 = "";
        String input2 = "";
        String input3 = "";
        try {
            System.out.print("Enter string 1: ");
            input1 = scanner.nextLine();
            System.out.print("Enter string 2: ");
            input2 = scanner.nextLine();
            System.out.print("Enter string 3: ");
            input3 = scanner.nextLine();
            System.out.println("You entered: " + input1 + ", " + input2 + ", " + input3);
            return "Success";
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            return "Failure";
        }
    }
}