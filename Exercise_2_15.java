// Exercise 2.15
package chapter2;

import java.util.Scanner;

public class Exercise_2_15 {

    public static void main(String[] args) {

        int number1;
        int number2;

        System.out.print("Enter number 1: ");

        Scanner getnum = new Scanner(System.in);
        number1 = getnum.nextInt();

        System.out.print("Enter number 2: ");
        number2 = getnum.nextInt();

        System.out.printf("Sum is %d\n", number1 + number2);
        System.out.printf("Product is %d\n", number1 * number2);
        System.out.printf("Difference is %d\n", number1 - number2);
        System.out.printf("Quotient is %d\n", number1 / number2);
    }
}
