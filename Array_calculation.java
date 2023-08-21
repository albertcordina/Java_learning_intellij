public class Array_calculation {
    public static int sumValue(int[] numbers) {
        int sum = 0;                          // initialize the starting 'sum';
        int i;

        for (i = 0; i < numbers.length; i++) // Iterate through all elements and add them to sum;
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




/*import java.util.Arrays;
// import Arrays class to use inbuilt sum() method
import java.io.*;

class GFG {
    public static void main (String[] args) {
        int [] nums = {1,2,3,4,5};
          int sum = Arrays.stream(nums).sum();
          System.out.println(sum);
    }
}*/