public class Loop_For {
    public static void main(String[] args) {

        // for loop = executes a block of code a LIMITED amount of times; 1:28;

        // for (int i=0; i<10; i++) {System.out.println(i);}
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        // the 3 statements:  i (shorten of "index") = DECLARATION;  i<10 = CONDITION;  i++ = INCREMENTATION or i-- = DECREMENTATION;

        //  for (int j=0; j<=1; j++) {String star = "*"; System.out.println(star);} // loop inside the loop;

        /* for (int i = 0; i < 10; i ++) {
            System.out.println();
            for (int j = 0; j < i; j ++) {
                System.out.print("*");
            }*/ // The loop 'Christmas tree';
    }
}
