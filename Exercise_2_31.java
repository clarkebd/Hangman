package chapter2;

public class Exercise_2_31 {

    public static void main(String[] args) {
        
        int x, square, cube;
        System.out.print("\nnumber  square   cube\n");
        
        for (x = 0; x < 11; x++) {
            // square = 0;
            // cube = 0;
            square = x * x;
            cube = x * x * x;
            System.out.printf("%d       %d        %d\n", x, square, cube);
        }
    }
}
