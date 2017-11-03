package Thread.Runable;

/**
 * @Describe:
 * @Date: 2017/10/27
 * @Modifiedby:
 */
public class RunableThread {
    public static void main(String[] args){
        PrimeRunnable t1 = new PrimeRunnable(1);
        PrimeRunnable t2 = new PrimeRunnable(1001);
        PrimeRunnable t3 = new PrimeRunnable(2001);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class PrimeRunnable implements Runnable {
    private int begin;
    public static final int STEPS = 1000;
    public static final int DELAY = 5;

    public static boolean IsPrimeNum(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i < num / 2; i++)
            if (num % i == 0)
                return false;
        return true;
    }


    public PrimeRunnable(int begin) {
        this.begin = begin;
    }

    @Override
    public void run() {
         try {
        for (int i = begin; i < begin + STEPS; i++) {
            if (i != 2 && i % 2 == 0)
                i++;
            if (PrimeRunnable.IsPrimeNum(i))
                System.out.println(Thread.currentThread().getName() + ": " + i);

        }
        Thread.sleep(DELAY);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}





