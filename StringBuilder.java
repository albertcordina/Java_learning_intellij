public class StringBuilder {
    public static void main(String[] args) {
        // Mutable StringBuilder- prints out the WHOLE LENGTH of the text;
        java.lang.StringBuilder str = new java.lang.StringBuilder("Oh my God! It's started to rain!");
        str.append("");
        System.out.println(str.length());
    }
}
