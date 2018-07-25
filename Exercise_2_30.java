package chapter2;

import java.util.Scanner;

public class Exercise_2_30 {

    public static void main(String[] args) {

        System.out.print("\nEnter 5 digit number: ");
        Scanner user_number = new Scanner(System.in);
        int number = user_number.nextInt();

        int firstremain = number % 10000;
        int secondremain = number % 1000;
        int thirdremain = number % 100;
        int fourthremain = number % 10;

        System.out.printf("%d   ", number / 10000);
        System.out.printf("%d   ", firstremain / 1000);
        System.out.printf("%d   ", secondremain / 100);
        System.out.printf("%d   ", thirdremain / 10);
        System.out.printf("%d   \n\n", fourthremain / 1);
    }
}
