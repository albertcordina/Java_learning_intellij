public class Array_operations {

    public static void main(String[] args) {

        int[] love = new int[2]; // the first way of creating an Array;
        love[0] = 6;
        love[1] = 10;

        System.out.println(addition(love));


        int [] life = {2,6,14,8}; // the second way of creating an Array;

        System.out.println(maximum(life));

        // created for the calculating the number of elements grater than the average of the Array;
        int [] way = {1,2,3,4,5,6,7};
        double average = 3.5;

        System.out.println(aboveAverage(way,average));

    }
    public static int addition(int[] love) { // the method calculates the 'sum'
                                             // and the 'average' of an Array;
        int x = 0;
        for (int y : love) {
            x += y;
        }
        return x;
        //	return x / love.length; //-> if we need an average;
    }
    public static int maximum(int[] life) { // the method identifies an element with the
                                            // 'minimum' or 'maximum' value within an Array;
        int x = life[0];
        for (int y : life) {
            if (y > x) {                 // -> for maximum;
                //      if (y < x) {	 //-> for minimum;
                x = y;
            }
        }
        return x;
    }

    public static int aboveAverage(int[] way, double average) { // the method calculates the number of elements
        int x = 0;                                              // above or under the average of the 'sum' of the whole Array.
        for (int y : way) {                                     // NOTE: the already calculated average is needed;
            if (y > average) { //-> for above;
                // if (y < average) { //-> for under;
                x++;
            }
        }
        return x;
    }

}



    /*
    public static int sumValue(int[] numbers) {
        int sum = 0;                          // initialize the starting 'sum';

        for (int i = 0; i < numbers.length; i++) // Iterate through all elements and add them to sum;
            sum += numbers[i];
        return sum;
    }

    public static int maxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static double minValue (int [] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static double aveValue (int [] numbers){
        int sum = sumValue(numbers);
        return (double) sum / numbers.length;

    }

    public static void main(String[] args) {
        int[] numbers = {16, 8, 23, 35, 11, 6, 19};
        System.out.println("Value of Sum: " + sumValue(numbers));
        System.out.println("The maximum Value: " + maxValue(numbers));
        System.out.println("The minimum Value: " + minValue(numbers));
        System.out.println("The average Value: " + aveValue(numbers));
    }
}

*/