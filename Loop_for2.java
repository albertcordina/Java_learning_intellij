public class Loop_for2 {
    public static void main(String[] args) {
        /*
        condition  --> must be a boolean expression
        while(condition) {
         --> while code block that we want to execute
        }
        do{
        } while (condition);

        int counter = 0; // 1. Declaring a variable
        while(counter < 10 'condition') {
        System.out.println(counter);
        counter++;
        } */
        // 'for' loop is the most used in Java;
        for(int i = 0; i < 5; i++){      // i=0 is a start point (declaration), i<5 is a boolean (condition), i++ is the steps (incrementation)
            System.out.println("i: " + i);
        }

        // for (;;) {} //  --> infinite loop;

        for (int n = 0; n < 10; n++) {
            if (n == 4) {
                break;    //  the loop should be stopped;
            }             // 'continue' is the condition to skip a certain step within the loop;
            System.out.println(n);
        }
    }
}
