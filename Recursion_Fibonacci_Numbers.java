public class Recursion_Fibonacci_Numbers { // is the sum of the previous and the one before previous number, e.g. 0,1,1,2,3,5,8,13...
    private static long[] fibonacciCache; // Array is to store the fibonacci numbers to speed up the calculation; Called: MEMOIZATION;

    public static void main(String[] args) {
        try {
             int n = 50; // 'n' is the position of the fibonacci number; NOTE: the maximum Java can calculate is the only 92 !
             fibonacciCache = new long[n + 1]; // '+ 1' is to call the position including the '0' position in the Array;

           //  for (int i = 0; i <= n; i++) {   //  <--- if we want the whole list of the fibonacci numbers;
           //  System.out.println(fibonacci(i));} }

        System.out.println(fibonacci(n)); } // <--- if we want only the result of the fibonacci number;
        catch (Exception e) { System.out.println("Needs a positive number.");}
    }

    private static long fibonacci (int n) { // 'n' is the position of the number;
        if (n <= 1) { return n;}           //  '0' and '1' are the 'base case' in this recursion (method within the method);
        if (fibonacciCache[n] != 0){ return fibonacciCache[n];}

        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2)); // the calculation of fibonacci.
        fibonacciCache [n] = nthFibonacciNumber; // to store the fibonacci number into the Array
        return nthFibonacciNumber;
    }
}
