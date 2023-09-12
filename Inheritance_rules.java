public class Inheritance_rules {

    /*
       Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.
       The new class that is created is known as subclass (child or derived class)
       and the existing class from where the child class is derived is known as superclass (parent or base class).
     */

    public static void main(String[] args) {

        String color = "blue";
        int speed = 50;
        Moto.Motorcycle(color, speed);


        Trucks1 volvo = new Trucks1("red", 80);
        System.out.println("The color of 'Volvo' is " + volvo.color + " and the speed is " + volvo.speed);

        Trucks1 ford = new Trucks1("yellow", 100);
        System.out.println("The color of 'Ford' is " + ford.color + " and the speed is " + ford.speed);

    }
}

class Moto extends Inheritance_rules {        // the inherited/ children classes 'extended' are not affecting the superior/ parent classes;

    public static void Motorcycle (String color, int speed) {
        System.out.println("The color of 'Volvo' is " + color + " and the speed is " + speed);

    }
}
class Trucks1 extends Inheritance_rules {

    String color;
    int speed;

    public Trucks1(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
}