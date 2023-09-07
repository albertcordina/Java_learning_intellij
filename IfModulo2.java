public class IfModulo2 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int modulo1 = number % 3;
        int modulo2 = number % 5;

        if (modulo1 == 0 && modulo2 == 0) {
            System.out.println("Operators are '3' and '5' and value is " + number);
            System.out.print("Value was pre incremented and now has a value of " + (number + 1));
            System.out.println(". The operation was done after the incrementation, so the result is " + (number + 1) * 10);
        }

        if (modulo1 == 0 && modulo2 > 0) {
            System.out.println("Operator is 3 and value is " + number);
            System.out.print("Value was pre incremented and now has a value of " + (number + 1));
            System.out.println(". The operation was done after the incrementation, so the result is " + (number + 1) * 10);
        }
        if (modulo2 == 0 && modulo1 > 0) {
            System.out.println("Operator is 5 and value is " + number);
            System.out.print("Value was pre incremented and now has a value of " + (number + 1));
            System.out.println(". The operation was done after the incrementation, so the result is " + (number + 1) * 10);
        }
    }
}
