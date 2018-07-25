package chapter2;

import java.util.Scanner;

public class Exercise_2_28 {

    public static void main(String[] args) {

        System.out.print("\nEnter Radius: ");
        Scanner user_radius = new Scanner(System.in);
        int radius = user_radius.nextInt();

        System.out.printf("diameter = %d\n", radius * 2);
        System.out.printf("circumference = %f\n", 2 * 3.14159 * radius);
        System.out.printf("area = %f\n\n", 3.14159 * radius * 2);
    }
}
