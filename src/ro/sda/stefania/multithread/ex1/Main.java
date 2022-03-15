package ro.sda.stefania.multithread.ex1;

/**
 * - Inherit a class from Thread and override the run( ) method.
 * - Inside run( ), print a message, and then call sleep( ).
 *   - Repeat this three times, then return from run( ).
 * - Put a start-up message in the constructor.
 *
 * - Make a separate thread class that calls System.gc( ) inside run( ), printing a message as it does so.
 * - Make several thread objects of both types and run them to see what happens.
 * - Experiment with different sleep times to see what happens.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Thread> threadsList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            threadsList.add(new ro.sda.raoul.multithread.ex1.FirstThread("Hello", + i));
        }
        for (int i = 0; i < 3; i++) {
            threadsList.add(new SecondThread("Hello", + i));
        }
        for (Thread thread : threadsList) {
            thread.start();

        }
    }
}
