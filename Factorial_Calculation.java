import java.util.Scanner;
public class Factorial_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, fact = 1;
        System.out.print("The calculation of the factorial\nPlease, enter your number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            while (n <= 0) {    //  the 'while' loop requests the user to enter only a positive number;
                System.out.print("Please, enter a positive number: ");
                n = scanner.nextInt();
                if (n > 0) {
                    for (i = 1; i <= n; i++) {
                        fact = fact * i;
                    }
                    System.out.println("Factorial of " + n + " is " + fact);
                }
            }
        } else {
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
        scanner.close();
    }
}
