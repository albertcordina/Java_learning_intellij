import java.util.Scanner;

public class Loop_in_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Printing a square pattern of asterisks based on a specified size\nPlease, enter the number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= n; j++) {
                System.out.print("*  ");
            }
        }
        scanner.close();
    }
}
