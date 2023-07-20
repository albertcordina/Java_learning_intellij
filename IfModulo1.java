public class IfModulo1 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
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