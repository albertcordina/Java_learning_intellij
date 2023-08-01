public class Wrapper {
    public static void main(String[] args) {
        // wrapper class = provides a way to use PRIMITIVE data types as REFERENCE data types; 1:59;
        //                'primitive' are used for numbers, they are faster with numbers
        //                'reference' data types contain useful methods
        //                 can be used with collections (ex.ArrayList)

        // primitive / wrapper
        // --------------------
        // boolean   / Boolean
        // char      / Character
        // int       / Integer
        // double    / Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding objects wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        // this is autoboxing:
        Boolean a = true;  // a.  -> opens the options to act as a reference variable, i.e. useful methods;
        Character b = '@'; // b.
        Integer c = 123;   // c.
        Double d = 3.14;   // d.
        String e = "Albert";

        // this is unboxing:
        if (a==true) {
            System.out.println("This is true");
        }
    }
}