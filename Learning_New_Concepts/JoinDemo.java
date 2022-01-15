package Learning_New_Concepts;

class myThread1 extends Thread{
    public void run()
    {
            for(int i=0;i<10;i++)
            {
                System.out.println("child -"+i);
            }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException{
        myThread1 t=new myThread1();
        t.start();
        t.join();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main -"+i);
        }
    }
}
