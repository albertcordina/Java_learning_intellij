public class Inheritance {                      // if we put 'final' in the line 'public final class Inheritance',
    public static void main(String[] args) {    // this class is not eligible for a child class;
        boy (2,3);
        System.out.println(Ik.b);   // the 'Ik.b' is a reference to the class 'Ik' and the 'int b' in it;
    }
    public static void boy(int a, int b) {  // the method gives a result according to the instructions
        int result;                         // within the method and the parameters in the 'main' method above;
        result = a + b;
        System.out.println("Result is: " + result);

    }
}
class Ik extends Inheritance {           // class 'Ik' is a child of the class 'Inheritance';
   public static int b = 55;    // the 'int b' can be easily used by the parent class 'Inheritance';
}
