package multithreadingpractice.maximumpriority;

public class MaximumPriority extends Thread {
    public void run() {
        System.out.println("Maximum Priority of thread is: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        MaximumPriority priority = new MaximumPriority();
        try {
            priority.setPriority(MAX_PRIORITY);
            priority.start();
        } catch (IllegalArgumentException e) {
            System.out.println("exception is caught");
        }
    }
}