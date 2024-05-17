public class Boolean_And_OR_operator {

    public static void main(String[] args) {

        // Boolean logical operator AND (&&) and OR (||) called short-circuit operators;
        // Short-circuit operators are logical operators that when evaluating two (or more) conditions,
        // may or may not evaluate the entire statement based upon the resulting evaluation from a previous condition;
        // 'for' loop is the most used in Java;

     /*   boolean isRaining = true;
        boolean haveUmbrella = false;
        boolean takeUmbrella = false;

      /*                                            // The first variant:
        boolean takeUmbrella;
          if (isRaining) {
            if (haveUmbrella) {
                takeUmbrella = true;
            }else {
                takeUmbrella = false;
            }
        }
        else {
            takeUmbrella = false;
        }

                                                    // the second variant:

        if (isRaining) {
            if (haveUmbrella) {
                takeUmbrella = true;
            }
        }

                                                    // the best resolution:

        if (isRaining && haveUmbrella) {
            takeUmbrella = true;
        }

        System.out.println(takeUmbrella);          */

        boolean isRaining = true;
        boolean mightRain = true;

        boolean takeUmbrella = false;

        if (isRaining || mightRain) { // at least one of the values has to be true. 'if' is a statement;
            takeUmbrella = true;
        }
        takeUmbrella = isRaining || mightRain; // a shorter option of writing a code;
        System.out.println(takeUmbrella);

        // Ternary operator (another short way of writing a code):
       // takeUmbrella = isRaining && mightRain  ?  true : false  ;  if isRaining and mightRain are true, the result is false;

        boolean haveUmbrella = false;

        if ((isRaining || mightRain) && haveUmbrella) {
            System.out.println("Take umbrella!");
        }
        else {
            System.out.println("Don't take umbrella!");
        }
    }
}
