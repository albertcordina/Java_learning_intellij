public class Polymorphism {                    // Polymorphism in Java is the ability of an object to take on
    public static void main(String[] args) {   // many forms from the 'parent' to the 'child' class object;

        Transport transport = new Transport(5600, "Black"); // the first use/ print out of the constructor from class 'Transport';
        Transport transport1 = new Transport(2000,"Blue");  // the second use/ print out of the constructor from class 'Transport';

        Truck auto = new Truck();         // the link to the class 'Truck' for linking a method(s);
        auto.SetValues(2000, "White");  // the use of the method/ function 'SetValues' from class 'Truck';
        auto.SetValues1(2.5, 5000);

        Truck car = new Truck(6000,"Green", 5.5);
        System.out.println("The width of the truck is: " + car.width);

    }
}

class Transport {
    int weight;
    int age;
    String color;

   public Transport(int weight, String color) {   //  the constructor:
        this.weight = weight;
        this.color = color;
        System.out.println("\nConstructor:\nThe weight of the truck is: " + weight + "\nThe color of the truck is: " + color);
    }

   public Transport() {}

}

class Truck extends Transport {
    double width;  // an additional variable for the constructor 'Truck' below;
    public Truck (int weight, String color, double width){
        super(weight,color);  // command 'super' is taking the empty variables from the parent class 'Transport';
        this.width = width;   // command 'this' is taking the empty variable within its class 'Truck';
    }


    public Truck (){};
                                          // this class 'Truck' has the methods:
    public void SetValues(int weight, String color) { // the empty variables 'weight' and 'color' are taken from the parent class 'Transport';
        this.weight = weight;
        this.color = color;
        System.out.println("\nThe method:\nThe weight: " + weight + "\nThe color: " + color);
    }
    double height;                                                   // the variable 'height' has been created and the empty
    public void SetValues1 (double height, int weight) {             // variable 'weight' is taken from the parent class 'Transport';
        this.weight = weight;
        this.height = height;
        System.out.println("\nThe method:\nThe HEIGHT: " + height + "\nThe WEIGHT: " + weight);
    }
}
