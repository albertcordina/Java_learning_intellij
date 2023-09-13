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
    }
}
class Car {
    String make = "Chevrolet";
    String model = "Corvette";

    void  drive() {
        System.out.println("You drive the car");
    }
    void brake() {
        System.out.println("You step on the brakes");
    }
}