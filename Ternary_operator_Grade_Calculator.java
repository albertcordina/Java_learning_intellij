import java.util.Scanner;

public class Ternary_operator_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Calculation of the 'letter grade' for a student based on their 'numerical score'\nPlease, enter your score: ");
        int score = scanner.nextInt();

        String result = (score >= 90) ? "'A'" : (score >= 80) ? "'B'" : (score >= 70) ? "'C'" : (score >= 60) ? "'D'" : (score >= 50) ? "'F'" : "";
        System.out.println("Your grade is " + result);

        scanner.close();
    }
}
