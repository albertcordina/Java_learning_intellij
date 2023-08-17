import java.util.Scanner;

public class Ternary_operator {       //   Ternary conditional operator is used for: 'if' , 'else if', and 'else' statements;
                                               //   It's a condensed form of the if-else statement that also returns a value;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temp in celsius: ");
        int temp = scanner.nextInt();

        String weather = (temp >= 40) ? "very hot!" : (temp >= 25) ? "hot!" : (temp >= 0) ? "cold!" : "freezing!";
        // 'if' the condition () is true, write "", 'if' the condition () is true, write "", and all the rest "" is 'else';
        System.out.println("The weather is " + weather);
    }
}
