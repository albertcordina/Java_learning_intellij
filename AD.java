import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class AD {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<Integer, String> MapName = new HashMap<>();
        Map<Integer, String> MapSurname = new HashMap<>();
        Map<Integer, Integer> MapAge = new HashMap<>();
        Map<Integer, String> MapPassword = new HashMap<>();
        Map<Integer, String> MapStatus = new HashMap<>();


        System.out.print("Enter you name: ");
        String name = scan.nextLine();

        System.out.print("Enter you surname: ");
        String surname = scan.nextLine();

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Enter your phone number: ");
        int phoneNumber = scan.nextInt();

        System.out.print("Enter the status: ");
        String status = scan.nextLine();
        status = scan.nextLine();

        MapName.put(phoneNumber,name);
        MapSurname.put(phoneNumber,surname);
        MapAge.put(phoneNumber,age);
        MapStatus.put(phoneNumber,status);


        System.out.print("Enter your phone number: "); // to access an info via entering a phone number as the 'key';
        int pn = scan.nextInt();

        System.out.println("Your name is " + MapName.get(pn));
        System.out.println("Your surname is " + MapSurname.get(pn));
        System.out.println("Your age is " + MapAge.get(pn));
        System.out.println("Your status is " + MapStatus.get(pn));
        }
    }
