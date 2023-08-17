import java.util.Scanner;

public class Voting_eligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eligibility to vote based on age and citizenship status\nPlease, enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a citizen? (Please, enter 'Yes' or 'Not'): ");
        String status = scanner.nextLine();
        status = scanner.nextLine();

        boolean withinAge = (age >= 18);
        boolean citizen = (status == "Yes");

     /*   if (withinAge && citizen){
            System.out.println("You are eligible to vote!");
        }
        else {
            System.out.println("You are not eligible to vote");
        }  */

        String result = (withinAge && citizen) ? "You are eligible to vote" : "You are not eligible to vote"; // TERNARY CONDITIONAL OPERATOR;
        System.out.println(result);
        scanner.close();
    }
}
