public class EvenOdd {
    public static void main(String[] args) {
        // counting the number of characters in a word/ sentence and give an outcome
        String input = ("you");
        int length = (input.length());
        int modulo = length % 2;
        if (modulo == 0){
            System.out.println(input+" --> "+" even ");
        }
        else {
            System.out.println(input+" --> "+" odd ");
        }
    }
}

/*
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0) // if the number can be divided to 2
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd"); // if not --> it is odd
    }
}

 */
