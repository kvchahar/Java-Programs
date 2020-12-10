package multithreadingpractice.threadrunnable;

public class ThreadDemo extends Thread {
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;
    }

    public void run() {
        try {
            System.out.println("Thread1: " + threadName);
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("Hello");
        ThreadDemo t2 = new ThreadDemo("World");
        t1.start();
        t2.start();
    }
}
