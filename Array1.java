import java.util.Arrays;
import java.util.stream.IntStream;

public class Array1 {
    public static int [] myArr4 = {1,2,3};

    public static void main(String[] args) {
 /*       int[] num = {1, 2, 3};  // the most common way of assigning the values to the array;

        double[] love = new double[10]; // assigning the size (10 empty elements) into 'love';
        love[0] = 5;  // assigning a value to the first element in the array, i.e. to [0];
        love[1] = 5;
        love[2] = 5;
        // the 'IntStream' Java interface is used to create the Arrays;
        int[] myArr = IntStream.range(1, 5).toArray(); // it creates an Array of 5 or more elements, containing the numbers from 1 to 4;
        System.out.println(Arrays.toString(myArr));

        int[] myArr1 = IntStream.of(1, 2, 3, 4).toArray(); // it creates an Array like with a curly brackets (see above);
        System.out.println(Arrays.toString(myArr1));

        int[] myArr2 = IntStream.of(2, 4, 1, 3).sorted().toArray(); // 'sorted' sets all the elements in numerical order;
        System.out.println(Arrays.toString(myArr2));

        int[] myArr3 = new int[3];                // we create the 3 elements,
        for (int x = 0; x < myArr3.length; x++) {   // and the loop selects every one of them,
            myArr3[x] = x;
            System.out.println(x);                 // and prints them out;

*/
        System.out.println(addition(myArr4));     // we need to call the method from the outside in order to get the result;
        }

    public static int addition (int [] myArr4) {

        int sum = 0;                               // a storage for collection is created;
        for (int i = 0; i < myArr4.length; i++) {  //  revision of the all elements is proceeded;
            sum += myArr4[i];                      //  'sum' is collecting all the values of the elements;
        }
        return (sum);                              // and it is ready to provide the result via the 'myArr4' from outside the method;
    }
}
