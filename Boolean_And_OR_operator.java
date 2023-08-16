public class Boolean_And_OR_operator {
    public static void main(String[] args) {
        // Boolean logical operator AND (&&) and OR (||) called short-circuit operators;
        // 'for' loop is the most used in Java;

        boolean isRaining = true;
        boolean haveUmbrella = false;

        /*

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
        System.out.println(takeUmbrella);



        // the second variant:
        boolean takeUmbrella = false;

        if (isRaining) {
            if (haveUmbrella) {
                takeUmbrella = true;
            }
        } */


        // the best resolution:
        boolean takeUmbrella = false;

        if (isRaining && haveUmbrella) {
            takeUmbrella = true;
        }

        System.out.println(takeUmbrella);
    }
}
