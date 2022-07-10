package Thread;

class MyThread extends Thread
{
    //Choice to override to start but not recommended
    MyThread()
    {
        super("My Thread");
    }
    public void start()
    {
        super.start();
        System.out.println("Start ovverided");
    }
    public void run()
    {
        System.out.println("Run Method");
        System.out.println(this);
    }
}
public class ThreadImplementationUsingThread {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        m.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("Main method");
        }
    }
}
