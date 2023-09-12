interface Shape2 {

    /*
    * Interfaces are used in Java to achieve abstraction.
    * By using the implements keyword, a java class can implement an interface (see below).
    * In general terms, an interface can be defined as a container that stores the signatures of the methods to be implemented in the code segment.
    * It improves the levels of Abstraction.
    */

    void draw();
}

class Circle2 implements Shape2 {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle2 implements Shape2 {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Interface_rules {

    public static void main(String[] args) {

        Shape2 rectangle = new Rectangle2();
        Shape2 circle = new Circle2();
        rectangle.draw();
        circle.draw();

    }
}