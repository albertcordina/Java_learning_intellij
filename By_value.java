public class By_value {

    public static void main(String[] args) {

       By_value app = new By_value(); // -> constructor: opens access to all other methods within the whole class;


        int value = 8; // this 'int value' exist only within this method;
        System.out.println("1. Value is: " + value);

        app.display(value); // importing 'int value' of '2.' and '3.' (with the changed value from 8 to 10) from the method 'display' below;

        System.out.println("4. Value is: " + value);

    }

    static public void display(int value) { // this 'int value' exists only within this 'display' method;
// public static void display(int value) { // 'static' method is added, then the 'App app = new App();' -> is not needed;

        System.out.println("2. Value is: " + value); // this 'value' is taken from 'int value' of the method above;
        value = 10;
        System.out.println("3. Value is: " + value); // this 'value' is taken from the assigned value above;

    }
}