package AJava;

import java.io.*;
interface StackOperations
{
    int max=10;
    void push(int data);
    void pop();
    int isempty();
    int isfull();
}
class Mystack implements StackOperations
{
    private int arr[]=new int[StackOperations.max];
    private int top;
    Mystack()
    {
        top=-1;
    }
    public void push(int data)
    {
        arr[++top]=data;
    }
    public void pop()
    {
        System.out.println("Poped element is :"+arr[top]);
        top--;
    }
    public int isempty()
    {
        if(top==-1)
            return 1;
        else
            return 0;
    }
    public int isfull()
    {
        if(top==9)
            return 1;else
            return 0;
    }
    public static void main(String arg[])throws IOException
    {
        int ch,data;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Mystack s=new Mystack();
        do
        {
            System.out.println("\n1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Exit.");
            System.out.println("\nEnter your choice:");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:if(s.isfull()==1)
                {
                    System.out.println("Stack is full");
                }
                else
                {
                    System.out.println("Enter the data :");
                    data=Integer.parseInt(br.readLine());
                    s.push(data);
                }
                    break;
                case 2:if(s.isempty()==1)
                {
                    System.out.println("Stack is empty");
                }
                else
                {
                    s.pop();
                }
                    break;
                case 3:System.exit(0);
                    break;
                default:System.out.println("\nInvalid choice:");
            }
        }while(ch!=4);
    }
}