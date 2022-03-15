package ro.sda.stefania.multithread.ex1;

public class SecondThread extends Thread{
    public SecondThread(String hello, int i) {
    }

    @Override
    public void run() {
        System.gc();
        System.out.println("Message from second thread.");
    }
}
