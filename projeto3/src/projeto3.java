import java.util.Random;

public class projeto3 {
    public static void main(String[] args) {
        MeuRunnable runnable = new MeuRunnable();

        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);
        Thread t5 = new Thread(runnable);
        Thread t6 = new Thread(runnable);
        Thread t7 = new Thread(runnable);
        Thread t8 = new Thread(runnable);
        Thread t9 = new Thread(runnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();

    }

    public static class MeuRunnable implements Runnable {
        static Object Lock1 = new Object();
        static Object Lock2 = new Object();
        double saldo = 2000.00;
        @Override
        public synchronized void run() {
            String name = Thread.currentThread().getName();

            synchronized (Lock1) {
                double valorSaque = Math.random()*10000;
                if (valorSaque > saldo) {
                    System.out.println("Pobre");
                } else {
                    saldo = valorSaque - saldo;
                }
            }

            synchronized (Lock2) {
                double valorDeposito = Math.random()*10000;
                saldo = valorDeposito + saldo;
            }
            System.out.println(name + ": " + saldo);
        }
    }
}