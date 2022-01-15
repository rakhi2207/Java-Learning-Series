package Learning_New_Concepts;

class MyThread1 extends Thread
{
    static Thread mt;
    public void run()
    {
        try
        {
            mt.sleep(1000);
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("child -"+i);

        }
    }
}
public class SleepDemo {
    public static void main(String[] args) {
        MyThread1 t=new MyThread1();
        t.mt=Thread.currentThread();
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("main -"+i);
        }
    }
}
