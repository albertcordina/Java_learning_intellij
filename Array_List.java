import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        // ArrayList = a resizable array. 2:06;
        //             Elements can be added and removed after compilation phase
        //             store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza"); //  'add' method is to add a value;
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi"); // 'set' method is to replace a value;
        food.remove(2); // 'remove' method is to remove a value;
        food.clear();         // 'clear' method is to remove all the values;

        for (int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
