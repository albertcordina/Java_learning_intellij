import java.util.*;

public class ExceptionHandlingDemo {
public static int n;
    public static int divisor;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//---------------------------------------------------------------------
 /*     System.out.print("Enter the 'dividend': ");
        int n = scan.nextInt();

        while (n <= 0) {
            try {
                System.out.print("Enter a positive number: ");
                n = scan.nextInt();
            } catch (InputMismatchException e) {     // in case of entering String instead of int;
                System.out.println("There should be a number, not any other character.");
                scan.nextLine();
            }
        }
        scan.close();
    }
}
*/

//--------------------------------------- WITH DO LOOP -----------------------------------------

        do {
            try {
                System.out.print("Enter a positive number: ");
                n = scan.nextInt();
            }                    //       in case of entering String instead of int;
            catch (InputMismatchException e) {System.out.println("There should be a number, not any other character.");
                scan.nextLine(); }
            }
              while  (n <= 0);   //       condition of a positive number to enter;
            scan.close();
        }
    }
