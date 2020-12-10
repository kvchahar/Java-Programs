package multithreadingpractice.evenodd;

class Even extends Thread {
    int n = 100;

    public void run() {
        try {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println("t1: " + i);
                }
                Thread.sleep(1000L);
            }
        } catch (Exception e) {
            System.out.println("exception is caught in EVEN Class");
        }
    }
}

class Odd extends Thread {
    public void run() {
        try {
            for (int i = 100; i > 0; i--) {
                if (i % 2 != 0) {
                    System.out.println("t2: " + i);
                }
                Thread.sleep(1000L);
            }
        } catch (Exception e) {
            System.out.println("Exception is caught in ODD Class");
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        Even t1 = new Even();
        t1.start();
        Odd t2 = new Odd();
        t2.start();
    }
}