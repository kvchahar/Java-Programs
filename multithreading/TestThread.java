package multithreading;

class RunnableDemo implements Runnable {
    private Thread t;
    private static final int LIMIT = 10;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int index = 0; index < LIMIT; index++) {
                System.out.println("Thread " + threadName + ", " + index);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread " + threadName + " exit");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread R1");
        r1.start();
        RunnableDemo r2 = new RunnableDemo("Thread R2");
        r2.start();
    }
}


