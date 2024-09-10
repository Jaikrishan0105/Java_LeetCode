import java.util.*;
class node
{
    int data;
    node next;
    public node(int data)
    {
        this.data=data;
        this.next=next;
    }
}
class circulardeleteoperation
{
    Scanner sc=new Scanner(System.in);
    node tail=null;
    void create()
    {
        System.out.println("enter the data:");
        int data=sc.nextInt();
        node newnode=new node(data);
        if(tail==null)
        {
            tail=newnode;
            tail.next=newnode;
        }
        else
        {
            newnode.next=tail.next;
            tail.next=newnode;
            tail=newnode;
        }
    }
    void display()
    {
        node t=tail.next;
        while(t!=tail)
        {
            System.out.print(t.data+"->");
            t=t.next;
        }
        System.out.print(t.data+"->null");
    }
    void deleteAtBegin()
    {
        node t=tail.next;
        tail.next=t.next;
    }
    void deleteAtEnd(int n)
    {
        node t=tail.next;
        int index=1;
        while(t!=tail)
        {
            index++;
            t=t.next;
            if(index==n-1)
            {
                break;
            }
        }
        t.next=tail.next;
        tail=t;
    }
    void deleteAtpos(int n)
    {
        System.out.println("enter the postion:");
        int pos=sc.nextInt();
        int N=n;
        if(pos==1)
        {
            deleteAtBegin();
        }
        else if(pos==N){
            deleteAtEnd(N);
        }
        else
        {
            int i1=1;
            node t1=tail.next;
            node t2=tail.next;
            node t3=tail.next;
            while(i1<pos-1)
            {
                t1=t1.next;
                i1++;
            }
            t2=t1.next;
            t3=t2.next;
            t2.next=null;
            t1.next=t3;
        }
    }
}
class circularlinkedlist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        circulardeleteoperation cll=new circulardeleteoperation();
        System.out.println("Enter the length of circular linked list:");
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            cll.create();
        }
        // cll.deleteAtBegin();
        // n--;
        // cll.deleteAtEnd(n);
        // n--;
        cll.deleteAtpos(n);
       cll.display();
    }
}