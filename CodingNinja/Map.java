package CodingNinja;

import java.util.ArrayList;

public class Map<K,V> {
    int noofBuckets=0;
    int count=0;
    ArrayList<MapNode<K,V>> ans=null;
    Map()
    {
        noofBuckets=10;
        ans=new ArrayList<>();
        for(int i=0;i<noofBuckets;i++)
        {
            ans.add(null);
        }
    }

    private int getHashCode(K key)
    {
        return key.hashCode()%noofBuckets;
    }
    public void insert(K key,V value)
    {
        int idx=getHashCode(key);
        MapNode<K,V> newNode=new MapNode<>(key,value);
        MapNode<K,V> head=ans.get(idx);
        while(head!=null)
        {
            if(head.key==key)
            {
                head.value=value;
                return ;
            }
            head=head.next;
        }
        head=ans.get(idx);
        ans.set(idx,newNode);
        count++;
        newNode.next=head;

        double loadFactor=count*1.0/noofBuckets;
        if(loadFactor>0.7)
        {
            rehase();
        }
    }

    private void rehase() {
        ArrayList<MapNode<K,V>> temp=ans;
        ans=new ArrayList<>();
        noofBuckets=noofBuckets*2;
        for(int i=0;i<noofBuckets;i++)
        {
            ans.add(null);
        }
        for(MapNode<K,V> node:temp)
        {
            while(node!=null)
            {
                insert(node.key,node.value);
                node=node.next;
            }
        }
    }

    public boolean search(K key,V value)
    {
        int idx=getHashCode(key);
        MapNode<K,V> head=ans.get(idx);
        while(head!=null)
        {
            if(head.value==value&&head.key==key)
            {
                return true;
            }
            head=head.next;
        }
        return false;
    }

    public void delete(K key)
    {
        int idx=getHashCode(key);
        MapNode<K,V> prev=null;
        MapNode<K,V> head=ans.get(idx);
        while (head!=null)
        {
            if(head.key==key)
            {
                if(prev!=null)
                     prev.next=head.next;
                else
                    ans.set(idx,null);
                count--;
                return ;
            }
            prev=head;
            head=head.next;
        }
    }

    public V getValue(K key)
    {
        int idx=getHashCode(key);
        MapNode<K,V> head=ans.get(idx);
        while(head!=null)
        {
            if(head.key==key)
            {
                return head.value;
            }
            head=head.next;
        }
        return null;
    }

    public int size()
    {
        return count;
    }
    public static void main(String[] args) {
        Map<Integer,Integer> m=new Map<>();
        m.insert(10,10);
        m.insert(10,40);
        m.insert(71,20);
        m.insert(51,90);
        m.insert(51,90);
        m.delete(51);
        System.out.println(m.search(90,20)+" ");
        System.out.println(m.getValue(51));
        System.out.println(m.size());

    }
}
