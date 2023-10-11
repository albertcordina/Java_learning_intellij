import java.util.Arrays;
import java.util.stream.IntStream;

public class Array_create {

    public static void main(String[] args) {
        int[] num = {1, 2, 3};  // the most common way of assigning the values to the array;

        double[] love = new double[10]; // assigning the size (10 empty elements) into 'love';
        love[0] = 5;  // assigning a value to the first element in the array, i.e. to [0];
        love[1] = 5;
        love[2] = 5;

        // the 'IntStream' Java interface is used to create the Arrays;
        int[] Arr = IntStream.range(1, 5).toArray(); // it creates an Array of 5 or more elements, containing the numbers from 1 to 4;
        System.out.println(Arrays.toString(Arr));

        int[] Arr1 = IntStream.of(1, 2, 3, 4).toArray(); // it creates an Array like with a curly brackets (see above);
        System.out.println(Arrays.toString(Arr1));

        int[] Arr2 = IntStream.of(2, 4, 1, 3).sorted().toArray(); // 'sorted' sets all the elements in numerical order;
        System.out.println(Arrays.toString(Arr2));

        int[] Arr3 = new int[3];                // we create the 3 elements,
        for (int x = 0; x < Arr3.length; x++) {   // and the loop selects every one of them,
            Arr3[x] = x;
            System.out.println(x);                 // and prints them out;
        }
    }
}
