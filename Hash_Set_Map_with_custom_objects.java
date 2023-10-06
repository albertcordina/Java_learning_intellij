import java.util.*;

public class Hash_Set_Map_with_custom_objects {
    public static void main(String[] args) {

        //     HASH SET:
        Set<Vehicle> vehicles = new HashSet<>(); // use the constructor of the class from below as a parameter;
                                                 // NOTE: 'TreeSet' DOES NOT work with it, due to the absence of the 'key' value;

        vehicles.add(new Vehicle(65, 3000.00,"Car"));
        vehicles.add(new Vehicle(35, 4500.00,"Truck"));
        vehicles.add(new Vehicle(85, 2300.00,"Motorcycle"));

        for (Vehicle vehicle : vehicles) {                        //  TO ITERATE THE WHOLE 'HashSet';
            System.out.println(vehicle);}

//---------------------------------------------------------------------------------------------------------------------------------
        //     HASH MAP:
        Map<String, Vehicle> body = new HashMap<>();
        //Map<String, Vehicle> body = new TreeMap<>();  // the 'TreeMap' sorts the 'key' value in alphabetical or numerical order;

        body.put("Bob",new Vehicle(25, 1500.00,"Car"));
        body.put("Marta", new Vehicle(10, 1000.00,"Truck"));
        body.put("Anna", new Vehicle(48, 2200.00,"Motorcycle"));

        // with the help of the constructor and the 'get' method below;
        System.out.println(body.get("Bob")); // to print out the all values of the 'key' 'Bob';
        System.out.println(body.get("Bob").getPrice());// to print out the only 'price' value of 'key' 'Bob';
        System.out.println(body.get("Bob").getType());// to print out the ony 'type' value of the 'key' 'Bob';

        //  with the help of the constructor and the 'toString' method below:
        for (Map.Entry<String, Vehicle> map : body.entrySet()) {   //  TO ITERATE THE WHOLE 'HashMap' (used mainly only for a review);
          System.out.println(map.getKey() + ", " + map.getValue());}
        for (Map.Entry<String, Vehicle> map : body.entrySet()) {   //  TO ITERATE THE WHOLE 'HashMap' to get only the 'price' values of the all 'keys';
                System.out.println(map.getKey() + ", " + map.getValue().getPrice());}
    }
}
//--------------------------------------------------------------------------------------------------------------------------------------------------
class Vehicle {
   private int serialNumber;
   private double price;
   private String type;

    // the constructor to create the objects (as the value) for the 'HashSet' and 'HashMap' in the class above;
    public Vehicle(int serialNumber, double price, String type) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.type = type;
    }
    // 'toString' is an Overridden method, which must have the same PARAMETERS as the constructor above and works with it to print out the elements;
    //  there can be the only one 'toString' method, therefore, it should be used for all the elements of the 'value';
    //  NOTE: 'toString' can be also used for only a certain parameter(s) of the value;

    // the 'return' is the outcome print which represents the all elements in the method;
    public String toString() { return "serial number: " + serialNumber + ", price: " + price + ", type: " + type;}



    // 'get' is to print out a CERTAIN PARAMETER of the 'value', and it works for the all 'keys' of the HashMap and an individual 'key';
    public String getPrice () { return "The price is " + price;} //  the 'getPrice' method is to print out the only 'price' value;

    public String getType () { return "The type is " + type;}  // the 'getType' method is to print out the only 'type' value;
}
