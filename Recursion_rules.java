public class Recursion_rules {
// Recursion is when the method calls itself;
    public static void main(String[] args) {

        sayHi(5); // the parameter is the count of cycles of recursion;
//      NOTE: it does not work for the large count of cycles, e.g. 10000 or more;
    }

    private static void sayHi (int count) {
        System.out.println("Hi!");

        if (count <= 1) { return; } //   the exit strategy (the 'base case', '1' is the 'base case' in this recursion):
        sayHi(count - 1);    //     with every call of the method inside the method,
    }                             //   it decrees the number of count and when it is 1 stops the program;
}
