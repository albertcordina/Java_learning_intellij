public class Method_Set_Get_rules {
    /*
    'Getters' and 'Setters' play an important role in retrieving and updating the value of a variable outside the Encapsulating class.
    They protect your data and make your code more secure.
    They also make the programmer convenient in setting and getting the value for a particular data type.

    ---  A 'Setter' updates the value of a variable, while a 'Getter' reads the value of a variable ---

    The 'Getter' and 'Setter' method gives you centralized control of how a certain field is
    initialized and provided to the client, which makes it much easier to verify and debug.
     */

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setColor("Blue");
        circle.setRadius(3);

        System.out.println("Circle:\n\nColor: " + circle.getColor() + "\nRadius: " + circle.getRadius() + "\nArea: "
                + circle.calculateArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("White");
        rectangle.setWidth(3.0);
        rectangle.setHeight(4.0);

        System.out.println("\n\nRectangle:\n\nColor: " + rectangle.getColor() + "\nWidth: " + rectangle.getWidth()
                + "\nHeight: " + rectangle.getHeight() + "\nArea: " + rectangle.calculateArea());
    }
}
//-----------------------------------------------------------------------------------------------------------------
class Shape {

    protected String color;

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
//-------------------------------------------------------------------------------
class Circle extends Shape {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
//--------------------------------------------------------------------------------
class Rectangle extends Shape {

    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double calculateArea() {
        return width * height;
    }
}