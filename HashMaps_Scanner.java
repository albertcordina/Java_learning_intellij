import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class HashMaps_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<Integer, String> MapName = new HashMap<>();
        Map<Integer, String> MapSurname = new HashMap<>();
        Map<Integer, Integer> MapAge = new HashMap<>();

        System.out.print("Enter you name: ");
        String name = scan.nextLine();

        System.out.print("Enter you surname: ");
        String surname = scan.nextLine();

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Enter your phone number: ");
        int phoneNumber = scan.nextInt();

        MapName.put(phoneNumber,name);
        MapSurname.put(phoneNumber,surname);
        MapAge.put(phoneNumber,age);

        System.out.print("Enter your phone number: "); // entering the 'key' to get the specific 'values', see below;
        int pn = scan.nextInt();

        System.out.println("Your name is " + MapName.get(pn));
        System.out.println("Your surname is " + MapSurname.get(pn));
        System.out.println("Your age is " + MapAge.get(pn));

        }
    }
