import java.util.*;
public class HashMap_rules {

    public static void main(String[] args) {
        // does not accept duplicates;
        // it  allows the same values (second element), but does not allow the same keys (the first element);
        // exists in pairs, i.e. the two Strings;
        // it uses the LinkedList
        // it does not have a reference to the previous element but has a reference to the next one;
        // not convenient for iteration;

        //  key     value
        Map <Integer, String> employeeIDs = new HashMap<>();

        employeeIDs.put(6589, "John");
        employeeIDs.put(5847, "Susan");
        employeeIDs.put(2541, "Joe");
        employeeIDs.put(3698, "Bob");

        System.out.println(employeeIDs);             // we can print out the whole list; ->  {3698=Bob, 5847=Susan, 6589=John, 2541=Joe}
        System.out.println(employeeIDs.get(6589));   // we can print out the only one pair; -> 'John'
        System.out.println(employeeIDs.containsKey(6589));      // we can see if the value is 'true' via the key;
        System.out.println(employeeIDs.containsValue("John"));  // we can see if the key is 'true' via the value;

        employeeIDs.put(3698, "Anna");              // we can create a new or overwrite the already existed value 'Bob' to 'Anna' via the key '3698';
        System.out.println(employeeIDs.get(3698));  // ' employeeIDs.replace ' -> method 'replace' only replaces the alrady existed value;

        employeeIDs.putIfAbsent(5896, "Albert");    // the method 'putIfAbsent' helps to put info if it is Absent in the 'HashMap';
        employeeIDs.remove(5896);                 // the method 'remove' removes the pair via the key;

        for (Map.Entry<Integer, String> map : employeeIDs.entrySet()) {   //  TO ITERATE THE WHOLE 'HashMap';
            System.out.println(map.getKey() + ", " + map.getValue());
        }
    }
}