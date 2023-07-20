public class EvenOdd {
    public static void main(String[] args) {
        // counting the number of characters in a word/ sentence and give an outcome
        String input = ("you");
        int length = (input.length());
        int modulo = length % 2;
        if (modulo == 0){
            System.out.println(input+" --> "+" even ");
        }
        else {
            System.out.println(input+" --> "+" odd ");
        }
    }
}
