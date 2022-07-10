package Durga;

class DemoThread extends Thread
{
        Thread t;
    public void run() {

        try {
            System.out.println("Child Thread start running");
            t.join();
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
public class DeadLockExample {
    public static void main(String[] args) throws InterruptedException {
        DemoThread d=new DemoThread();
        d.t=Thread.currentThread();
        d.start();
        System.out.println("Main Thread start running");
        d.join();
        System.out.println(Thread.currentThread());
    }
}
