import java.util.*;
public class Thread_Wait {

    public static void main(String[] args) {

        Account5 acc = new Account5(); // each Thread must have its own object;
        new Thread() {
            public void run () { acc.lessFive();}
        }.start(); // start() method causes this thread to begin execution, the result is that two threads are running concurrently;

        new Thread() {
            public void run () { acc.anotherTry();}
        }.start(); // start() method causes this thread to begin execution, the result is that two threads are running concurrently;
    }
}

class Account5 {

    Scanner scan = new Scanner (System.in);
  private static int n;

    synchronized void lessFive () {

        System.out.print("Enter a number grater than '5': ");
        n = scan.nextInt();

        if (n < 5) {
            System.out.println("Your number is less than '5'");

            try { wait(); } // method 'wait' jumps to the next method below (where the 'notify' is) and gets activated again after;
            catch (Exception e) { System.out.println(e); }
        }
        else { System.out.println("Thank you!");}
    }

    synchronized void anotherTry () {

        System.out.print("Enter your number one more time: ");
        n = scan.nextInt();

        if (n < 5) { System.out.println("You have failed!");

            try { notify(); }
            catch (Exception e) { System.out.println(e); }
        }
        else { System.out.println("Thank you!");}
    }
}
