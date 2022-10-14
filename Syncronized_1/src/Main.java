public class Main {
    static int i =-1;

    public static void main(String[] args) {
        MeuRunnable runnable = new MeuRunnable();

        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();

    }

    public static void imprime() {

        synchronized (Main.class) {
            i++;
            String name = Thread.currentThread().getName();

            System.out.println(name + ": " + i);
        }

    }

    public static class MeuRunnable implements Runnable {
        static Object Lock1 = new Object();
        static Object Lock2 = new Object();

        @Override
        public synchronized void run() {
//            System.out.println(Thread.currentThread().getName());
//            synchronized (Lock1) {
//                i++;
//                String name = Thread.currentThread().getName();
//
//                System.out.println("L1 "+ name + ": " + i);
//            }
//
//            synchronized (Lock2) {
//                i++;
//                String name = Thread.currentThread().getName();
//
//                System.out.println("L2 "+name + ": " + i);
//            }
            imprime();
        }


    }
}
