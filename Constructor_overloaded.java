public class Constructor_overloaded {

    public static void main(String[] args) {  // overloaded constructor =  multiple constructors within a class with the same name,
        //                           but have different parameters, name + parameter = unique signature; 3:17;

        System.out.println("Here are the ingredients of your pizza: ");

        Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzarella"); // the constructor can also be with no arguments;
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);


        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}

class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese) {      // -> the overloaded constructor of the constructor below;
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping) { // the constructor;
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

}
