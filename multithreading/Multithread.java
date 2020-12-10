package multithreading;

class MultithreadingDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId()
                    + " is running");
        } catch (Exception e) {
            System.out.println("exception is caught");
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            try {
                MultithreadingDemo object = new MultithreadingDemo();
                object.start();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("exception caught");
            }
        }
    }

}