import java.util.*;

public class Hash_Set_Map_with_custom_objects {
    public static void main(String[] args) {

        //     HASH SET:
        Set<Vehicle> vehicles = new HashSet<>(); // use the constructor of the class from below as a parameter;

        vehicles.add(new Vehicle(65, 3000.00,"Car"));
        vehicles.add(new Vehicle(35, 4000.00,"Truck"));

        for (Vehicle vehicle : vehicles) {                        //  TO ITERATE THE WHOLE 'HashSet';
            System.out.println(vehicle);
        }

        //     HASH MAP:
        Map<String, Vehicle> body = new HashMap<>();

        body.put("Marta",new Vehicle(25, 1500.00,"Car"));
        body.put("John", new Vehicle(10, 1000.00,"Truck"));

        System.out.println(body.get("John")); // to print out the only values of the 'Vehicle' according to the 'key', i.e. the name of the owner;

        for (Map.Entry<String, Vehicle> map : body.entrySet()) {   //  TO ITERATE THE WHOLE 'HashMap' (used mainly only for a review);
          System.out.println(map.getKey() + ", " + map.getValue());
      }
    }
}

class Vehicle {
    int serialNumber;
    double price;
    String type;

    public Vehicle(int serialNumber, double price, String type) { // the constructor to create the objects via the 'HashSet' and 'HashMap' in the class above;
        this.serialNumber = serialNumber;
        this.price = price;
        this.type = type;
    }
    public String toString() {   // 'toString' is an Overridden method, which has the same NAME and PARAMETERS;
        return "serial number: " + serialNumber + ", price: " + price + ", type: " + type; // this 'return' represents the all elements in the method;
    }
}
