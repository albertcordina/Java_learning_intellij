import java.util.Random;

public class Variable_scope {
    public static void main(String[] args) {    // local = declared inside a method, it is visible only to that method;
                      // global = declared outside a method, but within a class, it is visible to all parts of a class;

        DiceRoller diceRoller = new DiceRoller(); // 'diceRoller' is the instance of the class 'DiceRoller';

    }
}

class DiceRoller {
    Random random;
    int number;

    DiceRoller() {
        Random random = new Random();
        int number;
        roll();

    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}
