public class PrintOutCharacter {
    public static void main(String[] args) {
        // prints out a CHARACTER or part of a WORD or a TEXT out of the string;
        String input = "HELLO Gregor";

        System.out.println(input.charAt(6));          // one character;
        System.out.println(input.substring(6, 10));   // part of the word/sentence;

        // System.out.println(input.toLowerCase());   printing out the text of the string in upper/lower cases,
        // String input2 = input.toLowerCase();       creating another string with upper/lower cases.
        // System.out.println(input.toUpperCase());
        // String input2 = input.toUpperCase();

        // informing user about the number of the characters entered;
        if (input.length() < 5) {
            System.out.println("Your input is less than 5 characters");
        }
    }
}
