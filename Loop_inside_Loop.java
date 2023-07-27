import java.util.Scanner;
public class Loop_inside_Loop {
    public static void main(String[] args) {
        // nested loop = a loop inside a loop
        // import java.util.Scanner; is on the top of the code
        Scanner scanner = new Scanner(System.in);
int rows;
int columns;
String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for (int i=1; i <= rows; i++) {
            System.out.println();
            for (int j=1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}