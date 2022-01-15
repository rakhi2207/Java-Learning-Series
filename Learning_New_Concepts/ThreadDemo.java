package Learning_New_Concepts;


class Prime extends Thread
{
    static Thread mt;
    private int num;
    Prime(int num)
    {
        this.num=num;
    }
    private boolean check=false;
    public void run()
    {
        for(int i=2;i<num;i++)
        {
            for(int j=2;j*j<i;j++)
            {
                if(i%j==0)
                {

                }
            }
        }
    }
}
public class ThreadDemo {

}
