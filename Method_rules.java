public class Method_rules {
    public static void main(String[] args) {  // 'Object-Oriented Programming'
                                              // Method Signature is the combination of a method's name and its parameter list.
                                              // A class cannot have two methods with the same signature.
        Car myCar = new Car();                // Object = an instance of a class that may contain attributes and methods;
                                              // example: (phone, desk, computer, coffee cup);
        System.out.println(myCar.make);
        System.out.println(myCar.model);

        myCar.drive();
        myCar.brake();

//-----------------------------------------------------------------------------------------------------------------------------
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
//----------------------------------------------------------------------------------------------------------------------------
class Car {
    String make = "Chevrolet";
    String model = "Corvette";

    void  drive() {
        System.out.println("You drive the car");
    }
    void brake() {
        System.out.println("You step on the brakes\n");
    }
}