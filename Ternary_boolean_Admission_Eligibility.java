import java.util.Scanner;

public class Ternary_boolean_Admission_Eligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eligibility for admission\nEnter your GPA score: ");
        double gpa = scanner.nextDouble();

        System.out.print("Enter your SAT score: ");
        int sat = scanner.nextInt();

        boolean gpaEligible = (gpa >= 3.5);
        boolean satEligible = (sat >= 1500);

       // TERNARY CONDITIONAL OPERATOR;
        String result = (gpaEligible && satEligible) ? "You are eligible for admission" : "You are not eligible for admission";
        System.out.println(result);

        scanner.close();
    }
}
