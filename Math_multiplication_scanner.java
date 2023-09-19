// The math operation with entering the figures into the variables:

import java.util.Scanner;

public class Math_multiplication_scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long x, y, z;

        System.out.println("Please, enter the two figures for the multiplication.");

        System.out.println("Enter the first figure: ");
        x = scanner.nextLong();

        System.out.println("Enter the second figure: ");
        y = scanner.nextLong();

        // the multiplication:
        z = Math.multiplyExact(x, y);
        System.out.println("The result of the multiplication is: " + z);

        scanner.close();
    }
}
