import java.util.Scanner;

public class Loop_While_Blank {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's condition REMAINS TRUE, i.e. it doesn't go further unless you enter something;
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);
    }
}
