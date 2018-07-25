package chapter2;

import java.util.Scanner;

public class Exercise_2_32 {

    public static void main(String[] args) {

        int items, negatives = 0, positives = 0, zeros = 0;

        for (items = 1; items < 6; items++) {
            System.out.printf("\nEnter number %d: ", items);
            Scanner user_number = new Scanner(System.in);
            int x = user_number.nextInt();

            if (x < 0) {
                negatives = negatives + 1;
            }

            if (x > 0) {
                positives = positives + 1;
            }

            if (x == 0) {
                zeros = zeros + 1;
            }
        } // end for

        System.out.printf("\n%d Negative Numbers\n%d Positive Numbers\n%d Zeros\n", negatives, positives, zeros);

    } // end main
}
