import java.util.Scanner;

public class Voting_eligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eligibility to vote based on age and citizenship status\nPlease, enter your age: ");
        byte age = scanner.nextByte();

        System.out.print("\nAre you a citizen? (Please, enter 'Yes' or 'Not'): ");
        String status = scanner.nextLine();
        status = scanner.nextLine();


        boolean withinAge = (age >= 18);
        String Yes = "Yes";
        String Not = "Not";
        boolean istCitizen = (status.equals(Yes));
        boolean istNotCitizen = (status.equals(Not));
        boolean ist = (istCitizen || istNotCitizen);

        String result = (withinAge && istCitizen) ? "You are eligible to vote" : ""; // TERNARY CONDITIONAL OPERATOR;
        System.out.println(result);

        if (!ist) {
            while (!ist) {                                                // 'while' loop is for taking a precise result
                System.out.print("Please, enter 'Yes' or 'Not': ");       // from the user, i.e. 'Yes' or 'Not';
                status = scanner.nextLine();

                if (status.equals(Yes)) {
                    System.out.println("\nYou are eligible to vote!");
                    break;
                }
                if (status.equals(Not)) {
                    System.out.println("\nYou are not eligible to vote");
                    break;
                }
            }
        }
        scanner.close();
    }
}