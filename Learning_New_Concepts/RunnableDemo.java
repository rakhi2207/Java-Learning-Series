package Learning_New_Concepts;

class mt implements Runnable
{
    public void run()
    {
        try {
            System.out.println(Thread.currentThread().getName()+" is Running");
            Thread.sleep(2000);
        }catch (InterruptedException e)
        {

        }
        System.out.println(Thread.currentThread().getName()+" is completed");
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        mt r1=new mt();
        mt r=new mt();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r);
        t1.start();
        t2.start();
    }
}
