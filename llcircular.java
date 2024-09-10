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
class circularll_operation
{
    node tail=null;
    Scanner sc=new Scanner(System.in);
    void create()
    {
        System.out.println("Enter the data:");
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
        node temp=tail.next;
        while(temp!=tail)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }System.out.print(temp.data+"->null");
    }
    void insertAtbegin()
    {
        if(tail==null)
        {
            System.out.println("there is no value:");
            create();
        }
        else{
            System.out.println("Enter the data to insert at begin:");
            int data=sc.nextInt();
            node newnode=new node(data);
            newnode.next=tail.next;
            tail.next=newnode;
            }
    }
    void insertAtend()
    {
        if(tail==null)
        {
            System.out.println("there is no data in linkedlist:");
            create();
        }
        else
        {   
            System.out.println("enter the element to insert at end:");
            int data=sc.nextInt();
            node newnode=new node(data);
            newnode.next=tail.next;
            tail.next=newnode;
            tail=newnode;
        }
    }
    void inserAtpos()
    {
        if(tail==null)
        {
            System.out.println("there is no data in circular linked list:");
            create();
        }
        else
        {
            System.out.println("enter the data to insert at position:");
            int data=sc.nextInt();
            node newnode=new node(data);
            System.out.println("enter the postion to insert:");
            int pos=sc.nextInt();
            node t=tail.next;
            int i=1;
            while(t!=tail)
            {
                i++;
                t=t.next;
            }
            i++;
            if(pos==1)
            {
                newnode.next=tail.next;
                tail.next=newnode;
            }
            else if(pos>=i)
            {
                newnode.next=tail.next;
                tail.next=newnode;
                tail=newnode;
            }
            else
            {
                int i1=1;
                node t1=tail.next;
                node t2=tail.next;
                while(t1!=tail)
                {
                    i1++;
                    t2=t2.next;
                    if(i1==pos)
                    {
                        break;
                    }
                    t1=t1.next;
                }
                t1.next=newnode;
                newnode.next=t2;
            }
        }
    }
}
class llcircular
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ll length:");
        circularll_operation cll=new circularll_operation();
        int n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            cll.create();
        }
        // cll.insertAtbegin();
        // cll.insertAtend();
        cll.inserAtpos();
        cll.display();
        
    }
}