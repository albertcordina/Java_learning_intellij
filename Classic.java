class A {      //   example of a 'class' within a 'class';
    int x = 1;

    class B {
        int y = 2;
    }
}

public class Classic {

    public static void main(String[] args) {

        A ref1 = new A();
        A.B ref2 = ref1.new B();

        System.out.println(ref1.x + ref2.y);
    }
}