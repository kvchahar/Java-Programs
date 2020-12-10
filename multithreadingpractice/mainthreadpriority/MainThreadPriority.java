package multithreadingpractice.mainthreadpriority;

public class MainThreadPriority extends Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        System.out.println(t1.getPriority());
    }
}
