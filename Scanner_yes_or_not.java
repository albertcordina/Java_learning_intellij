import java.util.Scanner; // Alt + Enter;

public class Scanner_yes_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

//       --- Requesting the user a certain answer 'Yes' or 'Not' ---

        System.out.print("Are you married? (Enter 'yes' or 'not'): ");
        String mar_status = scanner.nextLine();

        if (mar_status.equals("yes") || mar_status.equals("not")) { System.out.println("Thank you.");}
        else {
            while (!mar_status.equals("yes") || !mar_status.equals("not")) {
                System.out.print("ERROR. Enter 'yes' or 'not': ");
                mar_status = scanner.nextLine();

                if (mar_status.equals("yes") || mar_status.equals("not")) {
                    System.out.println("Thank you for your answer.");
                    break;
                }
            }
        }
        scanner.close();
    }
}

