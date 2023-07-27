public class IndexOf {
    // indexOf() = method returns/ prints out the POSITION of the first occurrence of specified character(s) in a string.
    // lastindexOf() = method returns/ prints out the POSITION of the last occurrence of specified character(s) in a string.
    public static void main(String[] args) {
        String txt = "Please, Please locate where 'locate' occurs ";
        System.out.println(txt.indexOf("Please"));    //  prints out '0' (the starting position of the first 'Please');
        // System.out.println(txt.lastIndexOf("Please")); prints out '8' (the starting position of the second/last 'Please');
        //System.out.println(txt.indexOf("e", 15));  //  prints out the first 'e' after the 15th character in the string;
    }
}
