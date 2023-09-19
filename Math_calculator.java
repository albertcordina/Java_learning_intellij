import java.util.Scanner;

public class Math_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("   THE CALCULATOR");

        System.out.print("Enter the fist figure: ");
        double firs_figure = scanner.nextDouble();

        System.out.print("Enter the second figure: ");
        double second_figure = scanner.nextDouble();

        double result;

        System.out.print("The symbols of the actions:\n'+' for addition;\n'-' for subtraction;\n'*' for multiplication\n'/' for division;\nEnter your symbol: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                result = firs_figure + second_figure;
                System.out.println("The result: " + result);
                break;
            case "-":
                result = firs_figure - second_figure;
                System.out.println("The result: " + result);
                break;
            case "*":
                result = firs_figure * second_figure;
                System.out.println("The result: " + result);
                break;
            case "/":                                  // we use 'if' for the positive outcome and then the loop 'while' for the negative outcome(s) + 'if' at the end;
                if (second_figure != 0) {
                    System.out.println("The result: " + (firs_figure / second_figure));
                }

                while (second_figure == 0) {
                    System.out.print("This action can't be done. Please, do not use '0' for division.\nPlease, enter the second figure: ");
                    second_figure = scanner.nextDouble();
                }

                if (second_figure != 0) {
                    System.out.println("The result: " + (firs_figure / second_figure));
                }
                break;
        }
    }
}

