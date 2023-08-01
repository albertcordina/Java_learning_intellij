public class Methods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon; 2:22;
        //                             the PARAMETERS are the VARIABLES, i.e. the placeholders with no concrete values;
        //                             the ARGUMENTS are the VALUES passed during function invocation;

        String name = "Albert";
        int age = 21;

        hello(name, age);
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }
}
