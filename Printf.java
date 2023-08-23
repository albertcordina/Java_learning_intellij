public class Printf {
    public static void main(String[] args) {
        // printf() = an optional method to control, format, and display text to the console window ; 2:38;
        //            two arguments = format string + (object/variable/value)
        //            % [flags] [precision] [width] [conversion-character]

        System.out.printf("This is a format string %d\n",123); // '123' is a VALUE
        System.out.printf("%d This is a format string",123); // '%d' is a FORMAT SPECIFIER of the '123', which is the 'int',
                                                             // it prints out the value at the end or the beginning of the format string, i.e. the 'printf';

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Albert";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        //System.out.printf("%b", myBoolean);
        //System.out.printf("%c", myChar);
        //System.out.printf("%s", myString);
        //System.out.printf("%d", myInt);
        //System.out.printf("%f", myDouble); // for 'float' or 'double'

        // [WIDTH]
        // minimum number of characters to be written as output;
        // System.out.printf("Hello %10s",myString);

        //[PRECISIONS]
        // sets number of digits of precision when outputting floating-point values
        // System.out.printf("You have this much money %.2f",myDouble); // in this case '%.2f' prints out the number with the 2 decimal digits;

        //[FLAGS]
        // adds an effect to output based on the flag added to format specifier;
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for numeric value
        // 0 : numeric values are zero-padded
        // , : coma grouping separator if numbers > 1000

        System.out.printf("\nYou have this much money %,020f",myDouble);

        String name = "John";
        int age = 34;
        // %s, %d  ->  in case of 'String' and 'int';
        System.out.printf("\nMy name is %s and I am %d years old", name, age); // very useful in case if the value is repeated many times within the text;
        System.out.printf("\nMy name is %s and I am %d years old", "John", 34); // it can also be used without creating the variables;
    }
}
