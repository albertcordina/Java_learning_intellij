public class PrintOut_SaveCharacters_from_String_swap_Variables {
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

//   printing out the symbol(s) of a String;
        String firstLetter = " living zebras";
        char l = firstLetter.charAt(1);
        System.out.println(l);

        String secondLetter = " juicy oranges";
        char o = secondLetter.charAt(7);
        System.out.println(o);

        String thirdLetter = " do the victory dance";
        char v = thirdLetter.charAt(8);
        System.out.println(v);

        String fourthLetter = " tusk of an elephant";
        char e = fourthLetter.charAt(12);
        System.out.println(e);

//   printing out a part of the text out of a sentence/ text
        String aWord = "All they need is love";
        String love = aWord.substring(17,21);
        System.out.println(love);

//   swap the content of the variables by creating and use of an extra variable (exp. temp):
        String x = "water";
        String y = "Kool-Aid";
        String temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
