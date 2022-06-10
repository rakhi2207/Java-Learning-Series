package CodingNinja;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//
//public class UsingDynamicArray {
//    public static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(0,2,-4,1,-1,2,-3,1,-2,-1,2));
//        HashMap<Integer,Integer> h=new HashMap<>();
//        int count=0;
//        for(int i=0;i<arr.size();i++)
//        {
//            if(!h.containsKey(arr.get(i)))
//            {
//                h.put(arr.get(i),1);
//            }else
//            {
//                h.put(arr.get(i),h.get(arr.get(i))+1);
//            }
//
//        }
//        System.out.println(h);
//        for(int i:h.keySet())
//        {
//
//            if(i>0&&h.get(-1*i)!=null)
//            {
//                System.out.print(h.get(i)+" "+h.get(-1*i));
//                count+=Math.max(h.get(i),h.get(-1*i));
//            }
//        }
//        if(h.get(0)!=null)
//            count+=h.get(0)/2;
//
//        System.out.println(count);
//
////        ArrayList<Integer> a=new ArrayList<>();
////        a.add(10,9);
////        System.out.println(a);
////        DynamicArray d=new DynamicArray();
////        d.add(10);
////        d.add(15);
////        d.add(20);
////        d.add(25);
////        d.add(40);
////        d.add(12);
////        d.print();
////        System.out.println("get "+d.get(5));
////        System.out.println("size "+d.size());
////        while (!d.isEmpty())
////        {
////            System.out.println(d.removeLast());
////        }
////        System.out.println(d.isEmpty()+" "+d.size());
//    }
//}
class Vehicle{
    String colour;
    private int number;
    void set(int number)
    {
        number=number;
    }
    int get()
    {
        return number;
    }
}

public class UsingDynamicArray extends Vehicle{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.colour = "white";
        v.set(1010) ;
        System.out.println(v.colour + " " + v.get());
    }
}