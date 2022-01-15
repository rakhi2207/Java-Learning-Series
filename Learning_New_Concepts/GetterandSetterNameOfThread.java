package Learning_New_Concepts;

class MyThread extends Thread{

}
public class GetterandSetterNameOfThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread t=new MyThread();
        System.out.println(t.getName());
        Thread.currentThread().setName("Rakhi jha");
        System.out.println(Thread.currentThread().getName());
        try {
            System.out.println(10 / 0);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
