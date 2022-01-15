package Learning_New_Concepts;

class Display
{
    public static void m1(String name)
    {
        for(int i=0;i<5;i++) {
            System.out.print("Good morning:");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println(name);
        }
    }

    public static synchronized void m2(String name)
    {
        System.out.print("Good morning:");
        try
        {
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {

        }
        System.out.println(name);
    }

}

class MyThread2 extends Thread
{
   Display d;
    String name;
    MyThread2(Display d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.m1(name);
    }
}

class MyThread4 extends Thread
{
    Display d;
    String name;
    MyThread4(Display d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.m2(name);
    }
}

public class SynchronizedLearning {
    public static void main(String[] args) {
        Display d=new Display();
        MyThread2 m=new MyThread2(d,"Dhoni");
        MyThread2 m2=new MyThread2(d,"kohli");
        m.start();
        m2.start();
    }
}
