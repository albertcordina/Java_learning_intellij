class Animals {
    /*
     * Up-casting refers to typecasting a child object to a parent object.
     * Down-casting provides casting a parent object to a child object.
     */
    String name;

    public void makeNoise() {
        System.out.println("I am just an Animal");
    }
}
//------------------------------------------------------------------------------
class Dogs extends Animals {  // the subclass of Animal;

    @Override
    public void makeNoise() {
        System.out.println("Woof woof!");
    }

    public void growl() {     //  this method exists only in a Dog class;
        System.out.println("Grrrrrr");

    }
}
//--------------------------------------------------------------------------------------------------------------------------
public class Up_And_Downcasting {

    public static void main(String[] args) {
//                                                         UPCASTING:

        Animals animal = new Dogs(); // Up-casting Dog to Animal class; Creating a Child object and casting it to its Parent (easy);
                                    // Java always allows us to treat an Object of a Child type as an Object of its Parent type;
//      animal.growl();            // And yet, we do not have access to the method 'growl' in a Dog subclass;

        doAnimalStuff(animal);     // the print-out is 'Woof, woof!', because method 'makeNoise' is in the Animal and Dog classes;


//                                                         DOWNCASTING:

        Dogs dog = (Dogs) animal;   //  we tell Java that this Animal is a Dog;
        dog.growl();              //  now the method 'growl' in Dog class is working;

    }
    public static void doAnimalStuff (Animals animal) {
        animal.makeNoise();                         // the method 'makeNoise' is in the Animal and Dog classes;
        if (animal instanceof Dogs){                 // with 'if' we also print out 'Grrrrrr', i.e the method 'growl' of Dog class;
            Dogs dog = (Dogs) animal;
            dog.growl();
        }
    }
}