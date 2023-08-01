public class StringMethods {
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
    }
}
