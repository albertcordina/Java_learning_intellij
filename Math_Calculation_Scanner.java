import java.util.Scanner;

public class Math_Calculation_Scanner {
    public static void main(String[] args) {
        // the first calculation:
        System.out.println("The calculation of the following: 8d - 3d * 2d + 3d / 2d");
        System.out.print("Please, enter the variable 'd' for the calculation : ");

        Scanner scanner = new Scanner(System.in);
        double d1; // the variable 'd'
        double outcome1; // for the outcome result
        d1 = scanner.nextDouble();

        outcome1 = ((8 * d1) - (3 * d1 * 2 * d1) + (3 * d1) / (2 * d1));
        System.out.println("The result is: " + outcome1);
        System.out.println();

        // the second calculation:
        System.out.println("The calculation of the following: 80d / 40d / 20d / 10d / 5d / 2d");
        System.out.print("Please, enter the variable 'd' for the calculation : ");
        double d2; // the variable 'd' of the second calculation
        double outcome2;
        d2 = scanner.nextDouble();

        outcome2 = 80 * d2 / 40 * d2 / 20 * d2 / 10 * d2 / 5 * d2 / 2 * d2;
        System.out.println("The outcome of the result is: "+outcome2);


    }
}
