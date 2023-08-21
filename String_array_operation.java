public class String_array_operation {
    public static void main(String[] args) {

        String[] words = {"apple", "strawberry", "grape", "grapefruit", "watermelon", "pineapple"};

        for (int i = 0; i < words.length; i++) {   //  to display all the strings in the array;
            System.out.println(words[i]);
        }

        System.out.println("\nTo display the longest string in the array: ");
        String longest = words[0];                        // we create a 'longest' string equal to the first element;
        for (int j = 0; j < words.length; j++) {         //  tusk: is to check all the elements from '0' to max 'length' one by one , i.e. 'j++'
            if (words[j].length() > longest.length()) {  // if each element is longer than the 'one before' element
                longest = words[j];                 // we assign the longest element to the one of the elements of the array
                System.out.println(words[j]);     //  to display the longest element in the array;

            }
        }
    }
}
 /*
 We can also use Stream.max(Comparator) method for this:

   String[] arr = {"dog", "ostrich", "eagle"};

    String max = Arrays.stream(arr)
            .max(Comparator.comparingInt(String::length))
            .orElse(null);

  System.out.println(max); // ostrich  */