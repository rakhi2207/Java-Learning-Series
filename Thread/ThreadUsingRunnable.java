package Thread;

class ThreadDemo implements Runnable
{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadUsingRunnable {
    public static void main(String[] args) {
        ThreadDemo r=new ThreadDemo();
        Thread t=new Thread(r, "DemoThread");
        t.start();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
    }
}
