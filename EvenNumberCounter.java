public class EvenNumberCounter {
    void countAndDisplayEvents(int limit) {
        int current = 2;
        System.out.println("Even numbers:");
        do {
            System.out.println(current);
            current += 2;
        } while (current <= limit);
    }
}

class EvenNumberAssignment {
    public static void main(String[] args) {
        EvenNumberCounter evenNumberCounter = new EvenNumberCounter();
        evenNumberCounter.countAndDisplayEvents(23);
    }
}