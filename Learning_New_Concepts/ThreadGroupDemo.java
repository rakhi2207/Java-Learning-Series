package Learning_New_Concepts;


class MT extends Thread
{
    MT(ThreadGroup g,String name)
    {
        super(g,name);
    }

    public void run()
    {
        System.out.println("Child Thread");
        try
        {
            Thread.sleep(5000);
        }catch(InterruptedException e)
        {
        }
    }
}
public class ThreadGroupDemo
{
    public static void main(String[] args) throws InterruptedException{
        ThreadGroup pg=new ThreadGroup("Parent Group");
        ThreadGroup cg=new ThreadGroup(pg,"Child Group");
        MT m1=new MT(pg,"Thread1");
        MT m2=new MT(pg,"Thread2");
        m1.start();
        m2.start();
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
        Thread.sleep(10000);
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
    }

}