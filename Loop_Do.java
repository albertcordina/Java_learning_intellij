import java.util.Scanner;
public class Loop_Do {

    public static void main(String[] args) {

        int value = 0;
        while (value < 3) {   //  the system prints out all the numbers from '0' to '2';
            System.out.println("Hello! " + value);
            value = value + 1;
        }

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {    // 'do' loop is always executed first and then sees the condition;
            System.out.print("Please, enter a number: ");
            number = scanner.nextInt();
        } while (number != 5); // the system won't stop asking the user for the number unless the user enters '5';

        scanner.close();
    }
}