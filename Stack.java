class Stack{
    static Node top;
    static void push(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = null; //edge case
        if(top == null)
        {
            top = temp;
            return;
        }
        temp.next = top;
        top = temp;
        return;
    }
    static void display()
    {
        Node temp = top;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    static void pop()
    {
        if(top == null)
        {
            return;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        temp = null;
    }
    public static void main(String[] args)
    {
        Stack.push(10);
        Stack.push(1);
        Stack.push(8);
        Stack.push(5);
        Stack.display();
        Stack.pop();
        Stack.display();
    
    }
}
class Node
{
    int data;
    Node next;
}
