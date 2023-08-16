import java.util.Scanner;

public class EvenNumbersPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("The calculation of the even numbers within a specific range\nPlease, enter your fist number: ");
        n1 = scanner.nextInt();

        System.out.print("Enter your second number: ");
        n2 = scanner.nextInt();

        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        if (n1 > n2) {
            for (int i = n2; i <= n1; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
