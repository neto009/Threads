public class Main {
    public static void main(String[] args) {

        for (int i =0; i< 100; i++) {
            //criar o objeto thread
            Thread t = Thread.currentThread();
            System.out.printf(t.getName());

            //cria outro objeto
    //        Thread t0 = new Thread();
    //        System.out.println(t0);

            System.out.println();

            Thread t1 = new Thread(new MeuRunnable());
            t1.start();

            Thread t2 = new Thread(()-> {
                System.out.println(Thread.currentThread().getName());
            });

            t2.start();

            Thread t3 = new Thread(new MeuRunnable());
            t3.start();

            Thread t4 = new Thread(new MeuRunnable());
            t4.start();

            Thread t5 = new Thread(new MeuRunnable());
            t5.start();

            System.out.println();
            System.out.println();
        }

    }
}
