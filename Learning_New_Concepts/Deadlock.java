package Learning_New_Concepts;

class ch1
{
    public synchronized void m1(ch2 a)
    {
        System.out.println("Executing ch1");
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {

        }
        System.out.println("ch1 calling ch2's last method");
        a.last();
    }

    public synchronized void last()
    {
        System.out.println("Inside ch1's last method");
    }
}

class ch2
{
    public synchronized void m1(ch1 a)
    {
        System.out.println("Executing ch2");
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {

        }
        System.out.println("ch2 calling ch1's last method");
        a.last();
    }

    public synchronized void last()
    {
        System.out.println("Inside ch2's last method");
    }
}
public class Deadlock extends Thread {

    ch1 a=new ch1();
    ch2 b=new ch2();

    public void m1()
    {
        this.start();
        a.m1(b);
    }

    public void run()
    {
        b.m1(a);
    }
    public static void main(String[] args) {
        Deadlock d=new Deadlock();
        d.m1();
    }
}
