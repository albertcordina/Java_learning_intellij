class A1 {
    int ai = 1;
    public void a() {
        System.out.println("A-METHOD-a");
    }
    public void b() {
        System.out.println("A-METHOD-b");
    }
    public void g() {
        System.out.println("A-SINGLE-METHOD-g");
    }
}
//---------------------------------------------------------------------------
class B1 extends A1 {
    int bi = 2;

    public void a() {
        System.out.println("B-child- met-a");
    }

    public void b() {
        System.out.println("B-child-met-b");
    }

    public void c() {
        System.out.println("B-child-single-met-c");
    }
}
//----------------------------------------------------
public class Up_And_Downcasting_rules {

    public static void main(String[] args) {

        System.out.println("With ordinary access to 'parent' class 'A': ");
        A1 a = new A1(); // with an ordinary class access we can assess a particular class;
        a.a();
        a.b();
        a.g();
        System.out.println(a.ai);

        System.out.println("\nWith ordinary access to 'child' class 'B': ");
        B1 b = new B1();
        b.a();
        b.b();
        b.c();
        System.out.println(b.bi);
//----------------------------------------------------------------------------------------------------
//         -  Up and Down Casting is used to level up a child class to its parent class  -
//
//         Up - Casting gives us the convenience to use only one 'keyword' to access
//             the same named method(s) of the child class and also all other methods of its parent class;
//                 It excludes of use all the same named method(s) of the parent class!

        System.out.println("\nWith 'up-casting':");
        A1 a1 = new B1();
        a1.a();
        a1.b();
        a1.g();  // <- another method of the parent class;
        System.out.println(a1.ai); // and only the variables of the parent class can be accessed;
  //      System.out.println(a1.bi);


//         Down - Casting is addition to Up - Casting, and it gives us also the additional access to
//                                                     all other method(s) of the child class;
        System.out.println("\nWith 'down-casting':");
        B1 b1 = (B1) a1;
        b1.a();
        b1.b();
        b1.g();
        b1.c();          // <- another method of the child class;
        System.out.println(b1.ai); // and use the variables of
        System.out.println(b1.bi); // parent and child classes;
    }
}