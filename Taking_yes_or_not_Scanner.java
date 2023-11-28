import java.util.Scanner; // Alt + Enter;

public class Taking_yes_or_not_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("We need a response from you. ");

        choice(scanner);
        System.out.println("Your choice: " + choice(scanner));
    }
        /*
        String name = scanner.nextLine();

//       --- Requesting the user a certain answer 'Yes' or 'Not' ---

        System.out.print("Are you married? (Enter 'yes' or 'not'): ");
        String mar_status = scanner.nextLine().toLowerCase();

        while (!mar_status.equals("yes") && !mar_status.equals("not")) {
            System.out.print("Please, enter 'yes' or 'not': ");
            mar_status = scanner.next().toLowerCase();

        }
        // scanner.close();
    } */


    public static String choice (Scanner scanner) {

    		System.out.print("Please, enter 'yes' or 'not': ");
    String choice = scanner.next().toLowerCase();

		while (!choice.equals("yes") && !choice.equals("not")) {
            System.out.print("Please, enter 'yes' or 'not': ");
            choice = scanner.next().toLowerCase();
        }
        return choice;
    }
}

