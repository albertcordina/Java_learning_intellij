public class Array {
    public static void main(String[] args) {
        // array = is an OBJECT used to store MULTIPLE VALUES in a SINGLE VARIABLE; 1:38

        String[] cars = {"Camaro", "Corvette", "Tesla"}; // an array of cars;
        // String car = "Camaro"; - example of only a single value in a single variable 'car'. "Camaro" is an element;

        System.out.println(cars[2]); // example: to print out the element "Tesla" by entering the number of the position of this element;

        // Another way;
        // String[] cars = new String[3];
        // cars[0] = "Camaro";
        // cars[1] = "Corvette";
        // cars[2] = "Tesla";
        // System.out.println(cars[2]);

        for (int i = 0; i < cars.length; i++) { // to display all the arrays of the cars;
            System.out.println(cars[i]);
        }

        for (String i : cars){       // a shorter way to display all the elements (String) of the Array;
            System.out.println(i);
        }

        int [] path = {1,2,3,4,5};
        for (int i : path){          // a short way to display all the elements (int) of the Array;
            System.out.println(i);
        }
    }
}

/*

int [] numbers = {2,6,9};    // NOTE: we cannot refer to a particular element within an Array (stored in 'Heap' memory), however, we can reassign it;
numbers [1] = 7;             // ->  we reassign the '6' to '7';

String [] shoppingList = {"Bread", "Tomatoes"}; //  ->  'Bread' has the index [0], 'Tomatoes' has the index [1] in the line of the Array;
shoppingList [1] = "Grapes";                    //  ->   we reassign the 'Tomatoes' of the index [1] to 'Grapes';

String[] fruits = {"apple", "pear", "kiwi", "peach"};
for (int i = 0; i < fruits.length; i++) {System.out.print(fruits[i]};  // '___.length' -> considering all the ELEMENTS WITHIN THE ARRAY;
                                                   // 'System.out.print("_____" length ())' -> counting all the ELEMENTS WITHIN THE STRING;

int [] values = new int [4];  // setting the size of the Array without values yet;
values [0] = 6;               // we can assign a specific value for each element of the Array,
values [1] = 14;              // and it is not necessary to specify all of them;
values [2] = 23;

*/