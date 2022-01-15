package Learning_New_Concepts;


class myThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child thread");
            Thread.yield();
        }
    }
}
public class YieldInThread {
    public static void main(String[] args) {
        myThread t=new myThread();
        t.start();
       for (int i=0;i<10;i++)
       {
           System.out.println("Parent Thread");
       }
    }
}
