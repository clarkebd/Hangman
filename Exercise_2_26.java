//Exercise 2.26
package chapter2;

import java.util.Scanner;

public class Exercise_2_26 {

    public static void main(String[] args) {

        int number1;
        int number2;

        Scanner usernumber = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        number1 = usernumber.nextInt();

        System.out.print("Enter number 2: ");
        number2 = usernumber.nextInt();

        if (number1 % number2 == 0) {
            System.out.println("Yes number 1 is a multiple of number 2.");
        } else {
            System.out.println("No, number 1 is not a multiple of number 2.");
        }

    }
}
