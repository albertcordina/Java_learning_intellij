public class Array {
    public static void main(String[] args) {
        // array = used to store MULTIPLE VALUES in a SINGLE VARIABLE; 1:38

        String[] cars = {"Camaro", "Corvette", "Tesla"}; // an array of cars;
        // String car = "Camaro"; - example of only a single value in a single variable. "Camaro" is an element;

        System.out.println(cars[2]); // example: to print out the element "Tesla" by entering the number of the position of this element;

        // Another way;
        // String[] cars = new String[3];
        // cars[0] = "Camaro";
        // cars[1] = "Corvette";
        // cars[2] = "Tesla";
        // System.out.println(cars[2]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        } // to display all the arrays of the cars;
    }
}
