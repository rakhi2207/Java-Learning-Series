package Learning_New_Concepts;


public class VariousThreadConstructor {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        Thread.currentThread().setName("Rakhi");
        System.out.println(Thread.currentThread().getName());
        ThreadGroup pg=new ThreadGroup("Parent Thread");
        Thread t=new Thread("Hello");
        Thread t1=new Thread(pg,"Thread2");
        System.out.println(t1.getThreadGroup());
        Thread t2=new Thread();
        System.out.println(t2.getThreadGroup().getParent().getName());
        System.out.println(t.getName());
    }
}
