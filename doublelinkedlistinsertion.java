import java.util.*;
class node
{
    int data;
    node prenext;
    node next;
    public node(int data)
    {
        this.data=data;
        this.prenext=prenext;
        this.next=next;
    }
}
class doublelinklistoperation
{
    Scanner sc=new Scanner(System.in);
    node head=null;
    node tail=null;
    void create()
    {
        System.out.println("enter the data");
        int data=sc.nextInt();
        node newnode=new node(data);
        if(head==null)
        {
        tail=head=newnode;
        }
        else
        {
            tail.next=newnode;
            newnode.prenext=tail;
            tail=newnode;
        }
    }
    void display()
    {
        node t=head;
        while(t!=tail)
        {
            System.out.print(t.data+"->");
            t=t.next;
        }
        System.out.println(t.data+"->null");
    }
    void insertatbegin()
    {
        if(head==null)
        {
            System.out.println("there is no element in nodes:");
            create();
        }
        else
        {
            System.out.println("enter the data to insert at begin:");
            int data=sc.nextInt();
            node newnode=new node(data);
            head.prenext=newnode;
            newnode.next=head;
            head=newnode;
        }
    }
    void insertatend()
    {
        if(head==null)
        {
            System.out.println("there is no element in nodes:");
            create();
        }
        else
        {
            System.out.println("enter the data to insert at end:");
            int data=sc.nextInt();
            node newnode=new node(data);
            tail.next=newnode;
            newnode.prenext=tail;
            tail=newnode;
        }
    }
    void insertatpos(int n)
    {
        if(head==null)
        {
            System.out.println("there is no data in the linked list:");
            create();
        }
        else
        {
            System.out.println("enter the postion:");
            int pos=sc.nextInt();
            if(pos==1)
            {
                insertatbegin();
            }
            else if(pos==n)
            {
                insertatend();
            }
            else
            {
            System.out.println("enter the data to insert at postion:");
            int data=sc.nextInt();
            node newnode=new node(data);
            int i=1;
            node t=head;
            while(i<pos-1)
            {
                t=t.next;
                i++;
            }
            node t1=t.next;
            t.next=newnode;
            newnode.prenext=t;
            newnode.next=t1;
            t1.prenext=newnode;
            }
        }

    }
    void deleteAtBegin()
    {
        node t=head.next;
        t.prenext=null;
        head.next=null;
        head=t;
    }
    void deleteAtEnd()
    {
        tail=tail.prenext;
        tail.next=null;
    }
    void deleteAtpos(int n)
    {
        System.out.println("Enter the postion to delete the node:");
        int pos=sc.nextInt();
        if(pos==1)
        {
            deleteAtBegin();
        }
        else if(pos==n)
        {
            deleteAtEnd();
        }
        else
        {
            int index=1;
            node t1=head;
            node t2=head;
            node t3=head;
            while(index<pos-1)
            {
                t2=t2.next;
                index++;
                t1=t1.next;
            }
            t2=t2.next;
            t3=t2.next;
            t1.next=t3;
            t3.prenext=t1;
        }
    }
}
class doublelinkedlistinsertion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        doublelinklistoperation dll=new doublelinklistoperation();
        System.out.println("enter the length:");
        int i;int n=sc.nextInt();
        for(i=0;i<n;i++){
            dll.create();
        }
      //   // dll.insertatbegin();
      //   n++;
      //   // dll.insertatend();
      //   n++;
      //   //dll.insertatpos(n);
      //   n++;
      // //  dll.deleteAtBegin();
      // n--;
      //   //dll.deleteAtEnd();
      //   n--;
        dll.deleteAtpos(n);
        n--;
        dll.display();
    }
}