public class Wrapper_TypeCasting_rules {
/*
Wrapper class in Java helps in conversion from primitive to object as well as from object to primitive data type.
Creating a wrapper class automatically creates a new field where the primitive data types are stored.
The object of the wrapper class then holds the primitive data type.

Explicit type conversion in Java, also known as type casting, is used when you want to convert a value of one data type
to another data type that cannot be automatically done by the compiler.
Example 1: Converting an integer to a double. Example 2: Converting a double to an integer.

In implicit typecasting, the conversion involves a smaller data type to the larger type size.
For example, the byte datatype implicitly typecast into short, char, int, long, float, and double.
The process of converting the lower data type to that of a higher data type is referred to as Widening.
 */
    public static void main(String[] args) {

        // WIDENING type casting:
        int x = 7;
        long y = x;
        float z = y;
//   round() method to convert a double to int in Java
        System.out.println("int " + x + "\nlong " + y + "\nfloat " + z);


        // NARROWING type casting:
        double a = 5.5;
        long b = (long) a;
        int c = (int) b;
        // Typecasting. Since double is a bigger data type than int , it needs to be down-casted. See the syntax below: int IntValue = (int) DoubleValue;

        System.out.println("double " + a + "\nlong " + b + "\nint " + c);
//______________________________________________________________________________________________________________________________________

        /* String valueOf() method:
         *
         * valueOf() is a static method present in String class.
         * It is used to convert any data type like int, double, char, char array to its string representation by creating a new String object.
         * We can also use valueOf() to convert a char array to a String, or a subArray of a char array to a String.
         */

        int value = 30;
        String text = String.valueOf(value);

        System.out.println(text + 40);

        boolean b1 = true;
        boolean b2 = false;

        String text1 = String.valueOf(b1);
        String text2 = String.valueOf(b2);

        System.out.println(text1 + " " + text2);
//__________________________________________________________________________________________________

        // AUTOBOXING and UNBOXING;
        int n1 = 40;
        //Integer n2 = new Integer(n1); // -> Autoboxing or Boxing (a short way is below);
        Integer n2 = n1;

        Integer n3 = 6;                 // Boxing (assigning a value);
        System.out.println(n2 + " " + n3);

        Integer val = 60;
        int n = val;     // -> Unboxing;
        System.out.println(n);

        Integer n5 = 79;
        if (n5 < 90) {
            System.out.println(n5);
        }
    }
}