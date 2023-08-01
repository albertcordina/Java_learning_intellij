import java.util.ArrayList;

public class Loop_For_Each {
    public static void main(String[] args) {
        // for-each = 'enhanced for loop' traversing technique to iterate through the elements in an array/collection; 2:17;
        //            less steps, more readable;
        //            less flexible;

        //String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
