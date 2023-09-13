public class Polymorphism_RunTime {            // Polymorphism in Java is the ability of an object to take on
    public static void main(String[] args) {         // many forms from the 'parent' to the 'child' class object;

        System.out.println(boy.d);   // the 'Ik.b' is a reference to the class 'Ik' and the 'int b' in it;

        //boy.Person(3,3);

    }

                                    //  ANOTHER METHOD:
        public void Person (int a, int b) {  // the method gives a result according to the instructions
        int result;                                 // within the method and the parameters in the 'main' method above;
        result = a + b;
        System.out.println("Result is: " + result);

    }
}
                                    //  ANOTHER CLASS:

class boy extends Polymorphism_RunTime {           // class 'Ik' is a child of the class 'Inheritance';
    public static int d = 55;                   // the 'int b' can be easily used by the parent class 'Inheritance';


                                   //   POLYMORPHISM:
    // RUN-TIME (between two or more classes) polymorphism allows us to use many methods with THE SAME NAME but DIFFERENT SIGNATURES and return types.
    @Override                            // the Override is used for only copping the methods;
    public void Person(int a, int b){    //   The method 'Person' of the 'parent' class is copied by the 'child' class 'boy';

    }
}
