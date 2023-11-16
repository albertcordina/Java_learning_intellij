import java.util.Scanner;

public class Math_multiplication_table {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter your number: ");
        int n = scanner.nextInt();


        //   for (int i = 1; i <= 15; i+=2) {

        for (int i = 1; i <= 10; i++) {

            int result = i * n;
            System.out.println(i + " * " + n + " = " + result);
        }

        scanner.close();
    }
}
