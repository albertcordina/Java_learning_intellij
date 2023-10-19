public class AATrain {

    public static void main(String[] args) {

        try {
            int number = 50/0;
            System.out.println(number);

        }catch (ArithmeticException e) {
            System.out.println(e);
        }

        //finally { System.out.println("finally block is always executed.");}

        System.out.println("normal flow ...");
    }
}
