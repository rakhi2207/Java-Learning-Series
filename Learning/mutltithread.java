package Learning;

class newthread extends Thread{
    newthread()
    {
        super("MyThread");
        start();
    }
    public void run()
    {
        System.out.println(this);
    }
}
public class mutltithread {
    public static void main(String[] args) {
        new newthread();
    }
}
