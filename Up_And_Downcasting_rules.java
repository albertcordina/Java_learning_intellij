class A1 {

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

    public void a() {
        System.out.println("B-met-a");
    }

    public void b() {
        System.out.println("B-met-b");
    }

    public void c() {
        System.out.println("B-single-met-c");
    }
}
//----------------------------------------------------
public class Up_And_Downcasting_rules {

    public static void main(String[] args) {

        System.out.println("With ordinary access to class 'A': ");
        A1 a = new A1(); // with an ordinary class access we can assess only a particular class;
        a.a();
        a.b();
        a.g();

        System.out.println("\nWith ordinary access to class 'B': ");
        B1 b = new B1();
        b.a();
        b.b();
        b.c();
//-------------------------------------------------------------------------------------------------		
        System.out.println("\nWith 'upcasting':");
        A1 a1 = new B1(); // with 'upcasting', we can access all the methods of the parent class 'A1'
        a.a();           // and also the same named method(s) of the child class to the parent class;
        a.b();
        a.g();
        a1.a();
        a1.b();

        System.out.println("\nWith 'downcasting':");
        B1 b1 = (B1) a1; // with 'downcasting', we can access all the methods of parent and child classes;
        a.a();
        a.b();
        a.g();
        b1.a();
        b1.b();
        b1.c();

    }
}