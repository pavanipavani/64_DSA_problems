class Queue {
    static Node first ;
    static Node last;
    public static void queue(int data)
    {
        Node temp = new Node();
        temp.data = data;
        if(first == null)
        {
            first = temp;
            last = temp;
            return;
        }
        last.next = temp;
        last = temp;
        return;
    }
    static void display()
    {
        Node temp = first;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    static void dequeue()
    {
        if(first == null)
        {
            return;
        }
       Node temp = first;
       first = first.next;
       temp.next = null;
       temp = null;
       
       
    }
    public static void main(String[] args)
    {
        Queue.queue(10);
        Queue.queue(7);
        Queue.queue(5);
        Queue.dequeue();
        Queue.display();
        
    }
}
class Node
{
    int data;
    Node next;
}
