import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("THE CONVERTER FROM CELSIUS TO FAHRENHEIT\n\nPlease, enter the temperature in CELSIUS: ");
        double celsius = scanner.nextDouble();

        System.out.println("The temperature in FAHRENHEIT is " + ((celsius * 9 / 5) + 32) + " F");
    }
}
