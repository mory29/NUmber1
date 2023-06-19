/*Name : Mory DOUMBIA
* Class: CSC320-1
* Instructor: Douglas Mujeye*/

import java.util.Scanner;

public class TaxWithhold {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your weekly income: ");
        double income = input.nextDouble();

        double taxRate;
        if (income < 500) {
            taxRate = 0.1;
        } else if (income < 1500) {
            taxRate = 0.15;
        } else if (income < 2500) {
            taxRate = 0.2;
        } else {
            taxRate = 0.3;
        }

        double taxWithholding = income * taxRate;
        double averageTaxWithholding = taxWithholding / 52;

        System.out.printf("Your weekly average tax withholding is $%.2f", averageTaxWithholding);
    }
}