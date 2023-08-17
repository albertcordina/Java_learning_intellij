import java.util.Scanner;

public class Ternary_operator_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Calculation of the total cost of an order after applying a discount based on the order amount\nEnter the order amount: ");
        double order = scanner.nextDouble();

        boolean EligibleForDiscount = (order >= 100); // if the cost of the order is grater than or equal to 100;

        // TERNARY CONDITIONAL OPERATOR;
        String result = (EligibleForDiscount) ? "The total cost is " + order * 0.9 : "The total cost is " + order; // the discount is 10% (if eligible);
        System.out.println(result);

        scanner.close();
    }
}
