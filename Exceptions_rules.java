import java.util.InputMismatchException;

public class Exceptions_rules {

    /*
     * An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.
     * When an error occurs within a method, the method creates an object and hands it off to the runtime system.
     *
     * - UNCHECKED exceptions − An unchecked exception is an exception that occurs at the time of execution.
     * These are also called as Runtime-Exceptions. These include programming bugs, such as logic errors or improper use of an API.
     * Runtime exceptions are ignored at the time of compilation.
     *
     * - CHECKED exceptions − A checked exception is an exception that is checked (notified) by the compiler at compilation-time (when you write a code),
     * these are also called as Compile time-Exceptions. These exceptions cannot simply be ignored, the programmer should take care of (handle) these exceptions.
     *  https://www.tutorialspoint.com/java/java_exceptions.htm
     *
     *  The Runtime Exception is the parent class of all 'Exceptions' of the Java programming language that are expected to crash or break down the program or application when they occur.
     *  Unlike exceptions that are not considered as Runtime Exceptions, Runtime Exceptions are never checked.
     */

    public static void main(String[] args) {

        // int a = 23/0;                        // <- ArithmeticExeption;
        // System.out.println(a);

        // String text = null;                  // <- NullPointerExeption;
        // System.out.println(text.length());

        // int numbers [] = new int [7];        // <- ArrayIndexOutBoundsExeption;
        // numbers [9] = 59;

        // String text = "Text";                // <- NumberFormatException;
        // int number = Integer.parseInt(text);

        try {
            int a = 87 / 0;
        }                                                    // 'try' block is only working with 'catch';
        catch (ArithmeticException e) {
            System.out.println("Printed: " + e);
        }  // <- the line of the 'Exception' 'e' can also be printed out;

        try {
            int b = 85 / 0;
        } catch (Exception e) {
            System.out.println("Wrong action");
        }           // <- with the super type 'Exception', get access to all the types;
/*
      The 'try' statement makes a block of - CODE TO BE TESTED - for errors while it is being executed.
      The 'catch' statement makes a block of - CODE TO BE EXECUTED -, if an error occurs in the try block.
      The 'try' and 'catch' keywords come in pairs, and it also can have a 'multi-catch' blocks;

 */
        try {
            int numbers[] = new int[6];
            numbers[6] = 70 / 0;
        } catch (Exception e) {
            System.out.println("Invalid format!");
        }
        System.out.println("The rest of the code.");

//--------------------------- MULTI-CATCH BLOCK --------------------------------------------------------//
        try {
            String text = null;
            System.out.println(text.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception is thrown.");
        } // multi-catch blocks of code;
          catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Exception is thrown.");
        } catch (Exception e) {
            System.out.println("Super type Exception is thrown.");
        }

//----------------------------- NESTED TRY BLOCK --------------------------------------------------------//
        // outer try block
        try {
            try {
                int a = 68 / 0;
            }       // first inner try block
            catch (NullPointerException e) {
                System.out.println(e);
            } // catch block of the first inner try block

            try {
                int b[] = new int[10]; // second inner try block
                b[11] = 10;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            } // catch block of the second inner try block
        } catch (Exception e) {
            System.out.println("\nSuper type Exception in outer catch block");
        } // catch block of outer try block
        // As a result, the system accepts the above two unacceptable actions; with '68/0' and 'b[11]',
        // (when there are only 10 elements in the Array), and will continue run the code;
    }
}
//------------------ 'DO WHILE' LOOP (IF STRING IN STEAD OF INT) ---------------------------------------//
/*
        do {
            try {
                System.out.print("Enter a positive number: ");
                n = scan.nextInt();
            }                    //       in case of entering String instead of int;
            catch (InputMismatchException e) {System.out.println("There should be a number, not any other character.");
                scan.nextLine(); }
        }
        while  (n <= 0);   //       condition of a positive number to enter (as example);
        scan.close();
    }
}

*/