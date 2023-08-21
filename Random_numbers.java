import java.util.Random;       //  used for crating a guessing games, e.t.c.;

public class Random_numbers {  // NOTE: Random String can be generated only via a String Array;
    public static void main(String[] args) {
        Random random1 = new Random();
        Random random2 = new Random();

        int x = random1.nextInt(1501); // generates a number from '0' to '1500' in this case, i.e. '1' less than the set one;
        int y = random2.nextInt(1501); // NOTE: for 'double' we cannot set a decimal number, only as a whole (example: 10.00);

        System.out.println("Random number: " + x);
        System.out.println("Random number: " + y);

    }
}
