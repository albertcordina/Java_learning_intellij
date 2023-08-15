public class Extend {             //  Inheritance from the 'parent' to the 'extended' classes:
    public static void main(String[] args) {

        car volvo = new car(250, 2000, "Blue");
        truck man = new truck(100, 5000, "White", false);
        truck.setLoaded(true);
        truck.getLoaded();
    }
}

class Vehicles {                                                 // 'Vehicle' is the parent class for the 'car' and 'truck' classes below;
    public float speed;         // NOTE: the variables should have the
    public int weight;         // access modifiers 'private',i.e. for the class only, or 'public';
    public String color;

    public Vehicles(float speed, int weight, String color) {      // the parameters of the 'Constructor' match to
        this.speed = speed;                                       // the parameters of the 'Constructor' in underclass 'car';
        this.weight = weight;                                     // there could be one constructor for the many 'extended' classes,
        this.color = color;                                       // as long as the parameters are matching;
        System.out.println("Object via 'Constructor': \nspeed: " + speed + "\nweight: " + weight + "\ncolor: " + color + "\n");
    }

   /* public Vehicles(int speed, int weight, String color) {       // the parameters of the 'Constructor' match the
        this.speed = speed;                                      // parameters of the 'Constructor' in underclass 'truck';
        this.weight = weight;
        this.color = color;
        System.out.println("Object via 'Constructor' for trucks: \nspeed: " + speed + "\nweight: " + weight + "\ncolor: " + color + "\n");
    } */
}

class car extends Vehicles {    // class 'car' is inherited from the class 'Vehicle' above;
    public car(float speed, int weight, String color) {
        super (speed, weight, color);
    }
}
class truck extends Vehicles {  // class 'truck' is inherited from the class 'Vehicle' above;
    public truck(float speed, int weight, String color) {  // the constructor gets all the parameters from the superior
        super(speed,weight, color);                        //class 'Vehicles' with only the commands 'this' or 'super';
    }

    private static boolean isLoaded;
    public truck(float speed, int weight, String color, boolean isLoaded){
        super(speed,weight, color);                        // the constructor gets all the parameters from the superior
        this.isLoaded = isLoaded;                          // class 'Vehicles' with only the commands 'this' or 'super';
    }
    public static void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
    public static void getLoaded(){
        if(isLoaded)
            System.out.println("the truck is loaded");
        else System.out.println("the truck is not loaded");
    }
}
