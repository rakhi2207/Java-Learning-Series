package Learning;

import java.util.HashMap;
class Pair
{
    int key;
    int value;
    Pair(int key,int value)
    {
        this.key=key;
        this.value=value;
    }
}
class DoublyLinkedList
{
    int size = 2;
    HashMap<Integer,Node> h=new HashMap<>();

    class Node {
        Node prev;
        Pair data;
        Node next;

        Node(Node prev, Pair data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
    Node head=null;
    Node tail=null;
    DoublyLinkedList()
    {
        head=new Node(null,new Pair(0,0),null);
        tail=new Node(head,new Pair(0,0),null);
        head.next=tail;
    }

        public void insert(int key,int value)
        {
            System.out.println(key);
            Pair p=new Pair(key, value);
            Node n=new Node(null,p,null);
            if(h.size()<size)
            {
                if(!h.containsKey(p.key)) {
                    h.put(p.key, n);
                    Node afterHead = head.next;
                    n.next = afterHead;
                    head.next = n;
                }
            }else
            {
                Node beforeTail=tail.prev;
                h.remove(beforeTail.data.key);
                beforeTail.prev.next=beforeTail.next;
                beforeTail.next.prev=beforeTail.prev;
                h.put(p.key, n);
                n.prev=head;
                n.next=head.next;
                head.next.prev=n;
                head.next=n;
            }
        }

        public int get(int key)
        {
            if(h.containsKey(key))
            {
                Node n=h.get(key);
                Node prevn=n.prev;
                Node nextn=n.next;
                nextn.prev=prevn;
                n.next=head.next;
                head.prev=n;
                return n.data.value;
            }else
            {
                return -1;
            }
        }
}
public class LRUCache {
    public static void main(String[] args) {
        DoublyLinkedList ll=new DoublyLinkedList();
        ll.insert(1,2);
        ll.insert(2,3);
        ll.insert(1,5);
        ll.insert(4,5);
        ll.insert(6,7);
        System.out.println(ll.get(4));
        ll.insert(1,2);
        System.out.println(ll.get(4));
    }
}
