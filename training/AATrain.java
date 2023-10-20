package training;

public class AATrain {
/*
JAR files are used to package general Java applications or libraries,
while WAR files are specifically used to package web applications for deployment on a web server.
The choice between the two depends on the type of application you are building.
If you're creating a web application, you'll use a WAR file. For standalone applications or libraries, you'll use a JAR file.

 */
    public static void main(String[] args) {

        try {
            int number = 50/0;
            System.out.println(number);

        }catch (ArithmeticException e) {
            System.out.println(e);
        }

        //finally { System.out.println("finally block is always executed.");}

        System.out.println("normal flow ...");
    }
}
