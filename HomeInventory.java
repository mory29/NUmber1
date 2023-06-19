import java.util.Scanner;
class Home {
    private int square_feet;
    private String address;
    private String city;
    private String state;
    private int zip_code;
    private String Model_name;
    private String sale_status;

    public Home(int square_feet, String address, String city, String state, int zip_code, String Model_name, String sale_status) {
        this.square_feet = square_feet;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.Model_name = Model_name;
        this.sale_status = sale_status;
    }

    public String toString() {
        return "Square Footage: " + square_feet + "\nAddress: " + address + "\nCity: " + city + "\nState: " + state + "\nZip Code: " + zip_code
                + "\nModel Name: " + Model_name + "\nSale Status: " + sale_status;
    }

    public void updateHomeInfo(int square_feet, String address, String city, String state, int zip_code, String Model_name, String sale_status) {
        try {
            this.square_feet = square_feet;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip_code = zip_code;
            this.Model_name = Model_name;
            this.sale_status = sale_status;
            System.out.println("Home information updated successfully.");
        } catch (Exception e) {
            System.out.println("Failed to update home information. Please try again later.");
        }
    }

    public void removeHome() {
        try {
            this.square_feet = 0;
            this.address = "";
            this.city = "";
            this.state = "";
            this.zip_code = 0;
            this.Model_name = "";
            this.sale_status = "";
            System.out.println("Home successfully removed from inventory.");
        } catch (Exception e) {
            System.out.println("Failed to remove home. Please try again later.");
        }
    }
}

public class HomeInventory {

    public static void main(String[] args) {
        Home[] homes = new Home[3];
        homes[0] = new Home(1500, "123 Main St", "Anytown", "CA", 90000, "Colonial", "Available");
        homes[1] = new Home(2000, "456 Maple Ave", "Smallville", "PA", 10000, "Contemporary", "Sold");
        homes[2] = new Home(1800, "789 Oak St", "BigCity", "NY", 20000, "Traditional", "Under Contract");

        for (int i = 0; i < homes.length; i++) {
            System.out.println("Home " + (i + 1) + ": \n" + homes[i] + "\n");
        }

        homes[1].removeHome();
        System.out.println("Removed home:\n" + homes[1]);

        homes[1] = new Home(2500, "111 Elm St", "Newville", "FL", 30000, "Ranch", "Available");
        System.out.println("Added a new home:\n" + homes[1]);

        homes[1].updateHomeInfo(2200, "222 Elm St", "Newville", "FL", 30000, "Ranch", "Under Contract");
        System.out.println("Updated home information:\n" + homes[1]);

        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to print the home information to a file? (Y or N)");
        String response = scan.nextLine();
        if (response.equalsIgnoreCase("Y")) {
            // code to print to a file
            System.out.println("Printing home information to file...");
        } else {
            System.out.println("File will not be printed.");
        }
    }

}
