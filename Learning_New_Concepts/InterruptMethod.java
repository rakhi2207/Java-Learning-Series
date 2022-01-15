package Learning_New_Concepts;


class mthre extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child thread in loop");
        }
        System.out.println("Loop Ended");
        try
        {
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            System.out.println("I got Interrupted");
        }
    }
}
public class InterruptMethod {
    public static void main(String[] args) {
        mthre m1=new mthre();
        m1.start();
        m1.interrupt();
        System.out.println("main method ended");
    }
}
