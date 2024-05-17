import java.util.Scanner;

public class Boolean_number_range {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Validation of a given number within the valid range between 10 (included) and 50 (included)\nPlease, enter a number: ");
        int n = scanner.nextInt();

        boolean isWithinRange = (n >= 10 && n <= 50); // the 'boolean' is created to take the statement out of the scope 'if' for a further use;
        if (isWithinRange){
            System.out.println("the number is within the range");
        }
        else {
            System.out.println("the number is not within the range");
        }
        // String result = (n >= 10 && n <= 50) ? "is within the range" : "is not within the range"; // TERNARY CONDITIONAL OPERATOR;
        // System.out.println("The number " + result);
        scanner.close();
    }
}
