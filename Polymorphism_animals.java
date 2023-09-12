public class Polymorphism_animals {           // Polymorphism in Java is the ability of an object to take on
                                             // many forms from the 'parent' to the 'child' class object;
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);


 /*       Animal animal = new Dog();
        animal.eat(); // class 'Dog' has the method 'eat', it gets printed out (as the priority),
                     // otherwise, the method 'eat' of the 'parent' class 'Animal' is printed out;  */


 /*      Animal animal = new Dog();  // class 'Dog' is eligible to create the object 'animal' via its 'parent' class 'Animal',
          animal.eat();            // it is eligible to the method 'eat' of the class 'Animal'
          animal.bark();           // however, it is not eligible to a method in class 'Dog';

        Dog dog = new Dog();
           dog.eat();        // class 'Dog' is also eligible for the method 'eat', because it is a 'child' of the class 'Animal';
           dog.bark();       // and the method 'bark' simply belongs to the class 'Dog';      */
    }
    public static void test (Animal animal){
        animal.eat();
    }
}
//_________________________________________________________________________
class Animal {  // NOTE: all other than the 'Main' class, i.e. in our case 'Polymorphism_animals', classes should be 'public' in case of the separate files;
    public void eat() {
        System.out.println("Animal is eating ...");
    }
}
//_________________________________________________________________________
class Dog extends Animal {  //  class 'Dog' is a child of the class 'Animal';

    @Override
    public void eat() {
        System.out.println("Dog is eating ...");
    }

    public void  bark (){
        System.out.println("Dog is barking ...");
    }

}
//__________________________________________________________________________
class Cat extends Animal {  //  class 'Cat' is a child of the class 'Animal';

    @Override
    public void eat() {
        System.out.println("Cat is eating ...");
    }
}
