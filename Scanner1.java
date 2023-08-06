import java.util.Scanner; // Alt + Enter;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();

        System.out.print("Enter your height: ");
        float height = scanner.nextFloat();

        System.out.print("Are you married? (Enter 'Yes' or 'Not'): ");
        String mar_status = scanner.nextLine();
        mar_status = scanner.nextLine(); // should be used when 'if', 'while', or other condition takes place;

        if (mar_status.equals("Yes")) {
            System.out.println("Thank you");
        } else if (mar_status.equals("Not")) {
            System.out.println("Thank you");
        } else {

            while (mar_status != "Yes" || mar_status != "Not") {
                System.out.print("ERROR. Enter your status: ");
                mar_status = scanner.nextLine();

                if (mar_status.equals("Yes")) {
                    System.out.println("Thank you for your answer");
                    break;
                }
                if (mar_status.equals("Not")) {
                    System.out.println("Thank you for your answer");
                    break;
                }
            }
        }
    }
}



