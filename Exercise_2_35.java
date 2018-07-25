package chapter2;

// assignment 2_35
// 


import java.util.Scanner;

public class Exercise_2_35 {

    public static void main(String[] args) {

            System.out.print("\nEnter Total Miles Driven Per Day: ");
            Scanner input1 = new Scanner(System.in);
            int miles_driven = input1.nextInt();
            
            System.out.print("\nEnter Cost Per Gallon of Gas: ");
            Scanner input2 = new Scanner(System.in);
            float cost_gallon = input2.nextInt();
            
            System.out.print("\nAvg Miles Per Gallon: ");
            Scanner input3 = new Scanner(System.in);
            int avg_miles_gal = input3.nextInt();
            
            System.out.print("\nEnter Parking Fees Per Day: ");
            Scanner input4 = new Scanner(System.in);
            int parking_fees = input4.nextInt();
            
            System.out.print("\nEnter Tolls Per Day: ");
            Scanner input5 = new Scanner(System.in);
            int tolls = input5.nextInt();
            
            int gallons_gas_used = miles_driven / avg_miles_gal;
            float cost_for_gas = gallons_gas_used * cost_gallon;
            float total_cost = cost_for_gas + parking_fees + tolls;
            
            System.out.printf("Total Commuting Cost Per Day = %f\n\n", total_cost);
    }
}
