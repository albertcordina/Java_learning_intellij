import java.util.ArrayList;

public class ArrayList_rules {

    public static <Life> void main(String[] args) {
        // ArrayList = a resizable array. 2:06;
        // It contains a single array for data storage
        // Lists are therefore ordered collections (unlike sets) which also allow duplicates.
        // They are convenient because they enable easy manipulation of elements (such as insertion or fetching) and simple iteration of the entire collection.
        // Lists are data structures used for sequential element storage.
        // Elements can be added and removed after compilation phase
        // store reference data types

        ArrayList<String> food = new ArrayList<>();  // every new 'ArrayList' contains the first 10 empty elements.
                                                     // The size doubles automatically after all the elements are filled out;

        food.add("pizza"); //  'add' method is to add a value;
        food.add("hamburger");
        food.add("hot_dog");

        food.set(0, "sushi"); // 'set' method is to replace a value 'sushi' instead of 'pizza';
        food.remove(2); // 'remove' method is to remove a value 'hot_dog' from the list;
       // food.clear();         // 'clear' method is to remove all the values from the list;

        for (int i=0; i<food.size(); i++) { System.out.println(food.get(i));} // to print out the all ArrayList;
        for (String x : food) { System.out.println(x);} // 'for each' loop is a shorter;
        food.forEach(System.out::println);             //  'forEach' method is even shorter

        //      Training:
        ArrayList<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(52);
        list.add(121);

        System.out.println(list.get(0)); // get the '9' to print out;

        for (Integer n : list) { System.out.println("the element: " + n);} // via 'for loop': printing all the elements of the Array;

        for (int i = 0; i < list.size(); i++){ // also printing out all the elements;
            Integer n = list.get(i);
            System.out.println(i + ": " + n);

//------------------------------------------- Java Collections Frame Work --------------------------------------------------------
            ArrayList <Object> cat = new ArrayList<Object>();
            cat.add(new Object());
            cat.add(new Object());
           // for (Object a : cat) { System.out.println("the element: " + a);} // via 'for loop': printing all the elements of the Array;


        }
    }
}
