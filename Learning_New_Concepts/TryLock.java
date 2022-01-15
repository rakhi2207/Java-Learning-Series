package Learning_New_Concepts;


import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.*;
class Mth extends Thread
{
    static ReentrantLock l=new ReentrantLock();
    Mth(String name)
    {
        super(name);
    }
    public void run()
    {
        do{
        try {
                if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + "acquired the lock");
                    try {
                        Thread.sleep(30000);
                    } catch (InterruptedException e) {

                    }
                    System.out.println(Thread.currentThread().getName() + "released the lock");
                    l.unlock();
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "Is waiting to get a lock");
                }
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }

        }while(true);
    }

}
public class TryLock {
    public static void main(String[] args) {
        Mth m1=new Mth("First Thread");
        Mth m2=new Mth("Second Thread");
        Mth m3=new Mth("Third Thread");
        m1.start();
        m2.start();
        m3.start();
    }
}
