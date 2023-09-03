import java.util.*;       //     to import all the 'utilities' of Java;
public class LinkedList_rules {
        /*  the common area is the List Interface;
            the main difference between the 'ArrayList' and 'LinkedList' is the way they store their data.
            'LinkedList' has its elements in a doubly-linked-list and used more for data addition or deletion (does not contain Arrays).
            'ArrayList' is used more in data reading scenarios;
            'LinkedList' consists of the 'Nodes'. And the 'Nodes' contain the 3 objects: 1.Previous reference(address/link), 2. Value and the 3. Next reference(address/link);
            Therefore, the first and the last references are always 'Null';
         */

        public static void main(String[] args) {

            LinkedList<String> listItems = new LinkedList<>();
            listItems.add("Item 1"); // add(element);
            listItems.add("Item 2");
            listItems.add("Item 3");

            for (String x : listItems) {                  // iterates all the elements of the 'LinkedList';
                System.out.println(x);
            }

            for (int i = 0; i < listItems.size(); i++) {  // prints out all the elements of the 'LinkedList';
                String s = listItems.get(i);
                System.out.println(i + ": " + s);
            }

            /*  Most common methods of the LinkedList:

             * get(index);
             * getFirs(index);
             * getLast(index);
             * add(element);
             * add(index, element);
             * addFirst(element) and addLast(element);
             * remove(index);
             * removeFirs() and removeLast();
             * clear();
             */

            List<Integer> numbers = new ArrayList<>();    // 'List' is a super
            numbers.add(3);
            numbers.add(53);
            numbers.add(125);


          /*  public static void showList(List<Integer> numbers) {  // 'List<Integer> list' is access to the all 'Integer 'LinkedList' or Array Lists'
                                                               // of the class. It is a part of the polymorphism;
            for (Integer x : numbers) {
                System.out.println(x);
            } */

            }
    }