public class Constructor_rules {
    public static void main(String[] args) { // constructor = special method that is called when an object is instantiated (created); 3:00;
                                              // constructor helps us to assign different attributes to the different objects;

        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Morty", 16, 50);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.eat();       // calling the method 'eat' for the object 'human2';
        human1.drink();     // calling the method 'drink' for the object 'human1';
    }
}
class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {  // constructor;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {                                 // method 'eat';
        System.out.println(this.name + " is eating");
    }
    void drink() {                               // method 'drink';
        System.out.println(this.name + " is drinking");
    }
}