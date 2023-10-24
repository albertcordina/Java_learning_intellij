import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorService_threadPool {

    public static void main(String[] args) { // we can specify also the delay time of Thread

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2); // '2' is the number/ parameter of Threads
        //-------------------------------------------------------------------------------------------
        Runnable repeatedTask = new Runnable() { // create instance of Runnable interface

            @Override
            public void run() { System.out.println("Beep");}
        };
        //-------------------------------------------------------------------------------------------
        Runnable singleTask = new Runnable () { // create instance of Runnable interface

            @Override
            public void run() { System.out.println("One-time task");}
        };
        //-------------------------------------------------------------------------------------------
        executor.scheduleAtFixedRate(repeatedTask, 0, 5, TimeUnit.SECONDS); // the first parameter is for how long wait to start, the second one is an interval between;
        executor.schedule(singleTask, 8, TimeUnit.SECONDS);

        try { Thread.sleep(15000);} // sleep can be used for specifiying the time for how long the Thread is active
        catch (InterruptedException e) { e.printStackTrace();}

        executor.shutdown(); // if there is a further code, the method 'shutdown' is not nessessary
        try { executor.awaitTermination(1, TimeUnit.HOURS);} // always used to make sure the task is done, like 'scanner.close;'
        catch (InterruptedException e) { e.printStackTrace();}
    }
}