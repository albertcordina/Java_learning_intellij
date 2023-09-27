import java.util.*;
public class ExceptionHandlingDemo {
    public static int dividend;
    public static int divisor;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            try {
                System.out.print("Enter a positive 'dividend' number: ");
                dividend = scan.nextInt();
            }
            catch (InputMismatchException e) { // in case of entering String instead of int;
                System.out.println("There should be a number, not any other character.");
                scan.nextLine();
            }
        } while (dividend <= 0);    // condition/ requirement of a positive number to enter;



        do {
            try {
                System.out.print("Enter a 'divisor' number: ");
                divisor = scan.nextInt();
            }
            catch (InputMismatchException e) {   // in case of entering String instead of int;
                System.out.println("There should be a number, not any other character.");
                scan.nextLine();
            }
        } while (divisor == 0); // condition/ requirement of a non '0' number to enter (for the division);

        System.out.println("The quotient: " + dividend / divisor);

        scan.close();
    }
}

//--------------------------------------------------------------------------------------------
/*        try {
            System.out.print("Enter a number: ");
            int n = scan.nextInt();
        } catch (InputMismatchException e) {     // in case of entering String instead of int;
            System.out.println("There should be a number, not any other character.");
        }
    }
}

*/