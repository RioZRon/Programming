package Thread.Runable;

/**
 * @Describe:
 * @Date: 2017/10/27
 * @Modifiedby:
 */
public class TreadDo{
    public static void main(String[] args){
        ThreadTODO t1 = new ThreadTODO(1);
        ThreadTODO t2 = new ThreadTODO(1001);
        ThreadTODO t3 = new ThreadTODO(2001);
        ThreadTODO t4 = new ThreadTODO(3001);

        t1.start(t2,t3);
        t4.start();
    }
    
}

class ThreadTODO extends Thread{
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


    public ThreadTODO(int begin) {
        this.begin = begin;
    }
    @Override
    public void run() {
        synchronized (this) {
            try {
                for (int i = begin; i < begin + STEPS; i++) {
                    if (i != 2 && i % 2 == 0)
                        i++;
                    if (PrimeRunnable.IsPrimeNum(i))
                        System.out.println(Thread.currentThread().getName() + ": " + i);

                }
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //@Override
    public synchronized void start(Thread t1, Thread t2) {
        super.start();
        t1.start();
        t2.start();
    }
}