public class String_Methods {
    public static void main(String[] args) {
        // String = a reference data that can store one or more characters;1:53;
        //          reference data types hava access to useful methods

        String name = "Albert";

        // boolean result = name.equals("Albert");  prints out the 'true' if it matches
        // boolean result = name.equalsIgnoreCase("albert"); prints out 'true' if it does not match
        // boolean result = name.isEmpty(); prints out 'false' if it doesn't have any character

        // int result = name.length();   prints out the AMOUNT of the CHARACTERS in a string
        // int result = name.indexOf("A"); prints out the FIRST POSITION of a particular CHARACTER in the string
        // char result = name.charAt(0); prints out a CHARACTER via the position of it

        // String result = name.toUpperCase(); prints out the whole string in Upper Case
        // String result = name.toLowerCase(); prints out the whole string in Lower Case
        // String result = name.trim(); REMOVES the all EMPTY SPACES
        String result = name.replace('A', 'O'); // REPLACES one CHARACTER to another one

        System.out.println(result);

        // Creating Strings:
        String str1 = "Hello";
        String str2 = new String("World");

// Concatenating Strings:
        String results = str1.concat(" ").concat(str2); // "Hello World"
        //String result = str1 + " " + str2; // or using the + operator

// Getting Length:
        int length = result.length();

// Getting Substrings:
        String substring = results.substring(6); // " World"
        String subRange = results.substring(0, 5); // "Hello"

// Converting to Uppercase/Lowercase:
        String upper = results.toUpperCase(); // "HELLO WORLD"
        String lower = results.toLowerCase(); // "hello world"

// Checking for Equality:
        boolean isEqual = str1.equals(str2); // false
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello"); // true

// Checking for Presence:
        boolean contains = results.contains("lo"); // true
        boolean startsWith = results.startsWith("Hello"); // true
        boolean endsWith = results.endsWith("ld"); // true

// Finding Index of a Character or Substring:
        int indexOfW = results.indexOf("W"); // 6
        int lastIndexOfl = results.lastIndexOf("l"); // 9

// Replacing Characters:
        String replaced = results.replace('o', 'X'); // "HellX WXrld"

// Trimming Whitespaces:
        String withSpaces = "   Trim me   ";
        String trimmed = withSpaces.trim(); // "Trim me"

// Converting to Character Array:
        char[] charArray = results.toCharArray();

// Splitting Strings:
        String sentence = "This is a sample sentence";
        String[] words = sentence.split(" "); // {"This", "is", "a", "sample", "sentence"}

        /*
         * 	These are just a few examples, and the String class provides many more methods for string manipulation.
         *    Understanding these methods can be quite useful when working with strings in Java.
         */

//------------------------ Reversing String ----------------------------------------

        // Call the reverseString method to reverse the input string
        String reversedString = reverseString("love");
        System.out.println(reversedString); // prints out: 'evol'

    }

    private static String reverseString (String input) { // Method to reverse a given string
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Reverse the character array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            // Swap characters at positions i and j
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}