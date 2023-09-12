class X {      //   example of a 'class' within a 'class';
    int x = 1;

    class B {
        int y = 2;
    }
}

public class Class_inside_class {

    public static void main(String[] args) {

        X ref1 = new X();
        X.B ref2 = ref1.new B();

        System.out.println(ref1.x + ref2.y);
    }
}