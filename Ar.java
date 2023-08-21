public class Ar {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3,};
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
    }

    public static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return (max);
    }

    public static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return (min);
    }
}