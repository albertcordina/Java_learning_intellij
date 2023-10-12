import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_with_custom_object_Scanner {

    static private Integer phoneNumber;
    static private int age;
    static private String name;
    static private String surname;

    public HashMap_with_custom_object_Scanner(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;}

    public String toString () { return "\nthe name: " + name + "\nthe surname: " + surname + "\nthe age: \n" + age;}

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<Integer, HashMap_with_custom_object_Scanner> list = new HashMap<>();

        System.out.print("Enter you name: ");
        name = scan.nextLine();

        System.out.print("Enter you surname: ");
        surname = scan.nextLine();

        System.out.print("Enter your age: ");
        age = scan.nextInt();

        System.out.print("Enter your phone number: ");
        phoneNumber = scan.nextInt();


        list.put(phoneNumber, new HashMap_with_custom_object_Scanner(name, surname, age));

        System.out.println(list.get(phoneNumber)); // <--- printing out only the 'value(s)' of the certain 'key';

        // printing out the whole 'HashMap' with the 'keys' and its 'values' with the help of the 'toString' method above;
        for (Map.Entry<Integer, HashMap_with_custom_object_Scanner> map : list.entrySet()) {
            System.out.println("\nthe phone number: " + map.getKey() + ", " + map.getValue());}
    }
}