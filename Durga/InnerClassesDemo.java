package Durga;

import java.io.*;
class Dog implements Serializable
{
   transient int i=10;
   transient String name="puppy";
   int j=20;


   @Serial
   private void writeObject(ObjectOutputStream oos) throws Exception
   {
        oos.defaultWriteObject();
        int val=i+10;
        String valn=name+"mycode";
       oos.writeObject(val);
        oos.writeObject(valn);
   }

   private void readObject(ObjectInputStream ois) throws Exception
   {
       ois.defaultReadObject();
       int d1=(int)ois.readObject();
       String d=(String)ois.readObject();
       i=d1-10;
       name=d.substring(0,5);
   }
}
public class InnerClassesDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String x=Integer.toBinaryString(4);
        Dog d=new Dog();
        FileOutputStream fos=new FileOutputStream("/home/rakhi/abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);

        FileInputStream fis=new FileInputStream("/home/rakhi/abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d1=(Dog)ois.readObject();
        System.out.println(d1.i+" "+d1.j+" "+d1.name);

    }
}
