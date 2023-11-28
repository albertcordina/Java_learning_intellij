import java.util.Scanner; // Alt + Enter;

public class Taking_yes_or_not_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

//       --- Requesting the user a certain answer 'Yes' or 'Not' ---

        System.out.print("Are you married? (Enter 'yes' or 'not'): ");
        String mar_status = scanner.nextLine().toLowerCase();

        while (!mar_status.equals("yes") && !mar_status.equals("not")) {
            System.out.print("Please, enter 'yes' or 'not': ");
            mar_status = scanner.next().toLowerCase();

        }
        scanner.close();
    }
}
