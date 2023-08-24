public class Array_operations_2D {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 1, 2, 3 } };

        printArray(arr);
        System.out.println("The sum is: " + addition(arr));
        System.out.println("\nCount of Even Numbers: " + even(arr));

    }

    public static void printArray (int [] [] arr) {  // -> the method prints out the 2D Arrays;
        for (int [] x : arr) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
    public static int addition (int [] [] arr) { // -> the method calculates the sum of the 2D Arrays;
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                x += arr [i] [j];
            }
        }
        return x;
    }

    public static int even (int [] [] arr) {   // -> the method calculates the even numbers of the 2D Array;

        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    x++;
                }
            }
        }
        return x;
    }
}

