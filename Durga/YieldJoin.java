package Durga;


class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child");
        }
    }
}
public class YieldJoin {
    public static void main(String[] args) throws InterruptedException {
        MyThread m=new MyThread();
        m.start();
        m.join();
        for(int i=0;i<10;i++)
        {
            System.out.println("main");
        }
    }
}
