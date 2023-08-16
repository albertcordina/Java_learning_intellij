public class Constructor {
    public float speed;         // NOTE: the variables should have the
    public int weight;          // access modifiers 'private',i.e. for the class only, or 'public';
    public String color;
    public byte[] coordinate;

    // The 'Constructors' MUST HAVE: the different NUMBERS or the TYPES of parameters,
    // and they automatically get called to the appropriate objects in the main class 'Factory';
                                                    // Via 'Constructor';
    public Constructor(float speed, int weight, String color, byte[] coordinate) {                     // the 'Constructor' for the Object 'cars';
        System.out.println("Object via 'Constructor' for cars: \nspeed: " + speed + "\nweight: " + weight + "\ncolor: " + color + "\n");
    }

    public Constructor(float speed, int weight) {                                                      // the 'Constructor' for the object 'trucks';
        System.out.println("Via 'Constructor' vor trucks: \nspeed: " + speed + "\nweight: " + weight + "\n");
    }
                                                    //  Via the 'Method':
    public static void setValues(float speed, int weight, String color, byte[] coordinate) {  // the method 'setValues' helps to group
       /* this.speed = speed;                                                             // the parameters and shorten the code in the 'Factory' class;
        this.weight = weight;
        this.color = color;                // the keywords 'this' and 'super' help to create a method
        this.coordinate = coordinate;      // by copping the outer variables into this method; NOTE: used only without static. */
        System.out.println("Via the 'method': \nspeed: " + speed + "\nweight: " + weight + "\ncolor: " + color + "\n");
    }
}

class Factory {
    public static void main(String[] args) {
                                                   //  Via the 'Constructors':
        Constructor cars = new Constructor(50, 2000, "Red", new byte[]{100, 0, 100});  // The objects 'cars' and 'trucks' with the entered parameters
        Constructor trucks = new Constructor(30, 5000);                                      // GETS linked to the 'Constructors' in the class 'Constructor';

                                                   //  Via the 'Method':
        cars.setValues(50, 2000, "Red", new byte[]{100, 0, 100});    // to print out the results via the method 'setValues';
        trucks.setValues(30, 5000,"White", new byte[]{50, 0, 50});  // NOTE: it requires the corresponding number of the parameters;

                                                   //  Alternative/ basic way:

      /*   Constructor cars = new Constructor ();        // The objects 'cars' and 'trucks'
           Constructor trucks = new Constructor ();      // are linked to the class 'Constructor';

         cars.speed = 50;
         cars.weight = 2000;
         cars.color = "Red";
         cars.coordinate = new byte[] {100, 0, 100};

         trucks.speed = 30;
         trucks.weight = 5000;
         trucks.color = "White";
         trucks.coordinate = new byte[] {50, 0, 50};

         System.out.println("The ordinary way: \nspeed: " + cars.speed + "\nweight: " + cars.weight + "\ncolor: " + cars.color + "\n");
         System.out.println("The ordinary way': \nspeed: " + trucks.speed + "\nweight: " + trucks.weight + "\ncolor: " + trucks.color + "\n"); */
    }
}