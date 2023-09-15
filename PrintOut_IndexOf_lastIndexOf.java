public class PrintOut_IndexOf_lastIndexOf {
    // indexOf() = method returns/ prints out the POSITION of the first occurrence of specified character(s) in a string.
    // lastindexOf() = method returns/ prints out the POSITION of the last occurrence of specified character(s) in a string.
    public static void main(String[] args) {

        String txt = "Please, Please locate where 'locate' occurs ";  // NOTE: counting starts with 'P' as the position '0' in the String;

        System.out.println(txt.indexOf("Please"));                   //  prints out '0' (the starting position of the first 'Please');
        System.out.println(txt.lastIndexOf("Please"));          //  prints out '8' (the starting position of the second/last 'Please');

        System.out.println(txt.indexOf("e"));                       //  prints out '2' (the first 'e' in the String);
        System.out.println(txt.lastIndexOf("e"));               //  prints out '34' (the last 'e' in the String);

        System.out.println(txt.indexOf("e", 15));     //  prints out '20' (the first 'e' after the 15th character of the string);
        System.out.println(txt.lastIndexOf("e", 15)); // pints out '13' (the last 'e' before the 15th character of the string);

    }
}
