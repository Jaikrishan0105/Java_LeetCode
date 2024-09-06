import java.util.*;
class node
{
	int data;
	node next;
	public node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class linkedlist1
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
			head=tail=newnode;
		}
		else{
			tail.next=newnode;
			tail=newnode;
		}
	}
	void insertAtbegin()
	{
		if(head==null)
		{
			create();
		}else{
			System.out.print("Enter the data to insertAtbegin:");
			int data=sc.nextInt();
			node newnode=new node(data);
			newnode.next=head;
			head=newnode;
		}
	}
	void insertAtend(){
		if(head==null)
		{
			create();
		}
		else{
			/*System.out.print("enter the data:");
			int data=sc.nextInt();
			node newnode=new node(data);
			tail.next=newnode;
			tail=newnode;*/
			System.out.print("enter the data to insert at end:");
			create();
		}
	}
	void insertAtposition(int position)
	{
		 if (position == 0) {
            insertAtbegin();
            return;
        }

        System.out.print("Enter the data to insert at position " + position + ": ");
        int data = sc.nextInt();
        node newnode = new node(data);

        node current = head;
        int index = 1;

        while (current != null && index < position-1) {
        	current = current.next;
           	index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds. Adding at the end.");
            insertAtend();
        } else {
            newnode.next = current.next;
            current.next = newnode;

            if (newnode.next == null) {
                tail = newnode;
            }
	}
}
	 void printList() {
        node current = head;
       	while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


class linklist{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		linkedlist1 ll=new linkedlist1();
		ll.create();
		ll.create();
		ll.create();
		//ll.insertAtbegin();
		//ll.insertAtend();
		System.out.println("Enter the position:");
		int pos=sc.nextInt();
		ll.insertAtposition(pos);
		ll.printList();
	}
}