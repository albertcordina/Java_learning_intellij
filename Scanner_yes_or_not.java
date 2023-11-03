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
/*
                    --- Requesting the user to enter a number and not any other character ---

                int age;                  //  example of int
                boolean input = false;

				while (!input) { // the loop to request the user a number not any other character
				try {
					System.out.print("Enter your age: ");
					age = scan.nextInt();
                    input = true;
                    scan.nextLine();

				} catch (InputMismatchException e) {  //   the 'java.util.InputMismatchException'
					System.out.print("Invalid input. ");
					scan.nextLine();
				} }

 */


