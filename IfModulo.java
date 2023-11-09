public class IfModulo {

    public static void main(String[] args) {

        int number = 7;
       // int number = Integer.parseInt(args[8]);
        int modulo = number % 2;


        if (modulo == 0 && number > 0) {
            System.out.println("The number " + number + " is even and positive");
        }
        if (modulo == 0 && number < 0) {
            System.out.println("The number " + number + " is even and negative");
        }
        if (modulo > 0 && number > 0) {
            System.out.println("The number " + number + " is odd and positive");
        }
        if (modulo > 0 && number < 0) {
            System.out.println("The number " + number + " is odd and negative");
        }
    }
}