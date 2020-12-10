package multithreadingpractice.lambdaexpression;

public class Multithread1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = () ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("kv");
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    System.out.println("exception found");
                }
            }
        };

        Runnable r2 = () ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("chahar");
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    System.out.println("exception found");
                }

            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}