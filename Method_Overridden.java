// Superclass
class Animal5 {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Subclass
class Cat5 extends Animal5 {
    // Overriding the makeSound method of the superclass
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
/*
Method overriding in Java: the subclass provides its own implementation for a method defined in its superclass.


Animal is the superclass with a method makeSound().
Cat is the subclass that extends Animal.
In the Cat class, we use the @Override annotation to indicate that we are intentionally overriding the makeSound method from the superclass.
The overridden method in the Cat class provides a specific implementation for the makeSound method, printing "Meow" to the console.

 */
public class Method_Overridden {

    public static void main(String[] args) {
        // Create an instance of the superclass
        Animal5 genericAnimal = new Animal5();
        // Call the makeSound method of the superclass
        genericAnimal.makeSound();

        // Create an instance of the subclass
        Cat5 myCat = new Cat5();
        // Call the makeSound method of the subclass
        myCat.makeSound();
    }
}