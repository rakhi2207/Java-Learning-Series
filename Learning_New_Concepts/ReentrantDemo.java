package Learning_New_Concepts;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;
class mthread extends Thread
{
    static ReentrantLock l=new ReentrantLock();
    mthread(String name)
    {
        super(name);
    }
    public void run()
    {
        do{
           try
           {
               if(l.tryLock(5000,TimeUnit.MILLISECONDS))
               {
                   System.out.println(Thread.currentThread()+" has got the lock");
                   try
                   {
                       Thread.sleep(30000);
                   }catch (InterruptedException e)
                   {

                   }
                   System.out.println(Thread.currentThread()+" releasing the lock");
                   l.unlock();
                   break;
               }else
               {
                   System.out.println(Thread.currentThread()+" trying to get the lock");
               }
           }catch(InterruptedException e)
           {

           }
        }while(true);
    }
}
public class ReentrantDemo {
    public static void main(String[] args) {
        mthread m1=new mthread("First Thread");
        mthread m2=new mthread("second Thread");
        m1.start();
        m2.start();
    }
}
