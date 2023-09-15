import java.util.*;
public class StringBuilder {
    /*
        StringBuilder is a class in the Java API that provides a mutable sequence of characters.
        It is used for dynamic string manipulation, such as building strings from many smaller strings or appending new characters to an existing string.
    */

    public static void main(String[] args) {
        // Mutable StringBuilder- prints out the WHOLE LENGTH of the text;
        java.lang.StringBuilder str = new java.lang.StringBuilder("Oh my God! It's started to rain!");
        str.append("");
        System.out.println(str.length());
    }
}
