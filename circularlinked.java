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
class circularlinklist
{
	node tail=null;

	Scanner sc=new Scanner(System.in);
	void create()
	{
	System.out.println("enter the data:");
	int data=sc.nextInt();
	node newnode=new node(data);
	if(tail==null)
	{
		tail=newnode;
		newnode.next=newnode;
	}
	else{
		newnode.next=tail.next;
		tail.next=newnode;
		tail=newnode;
	}
	}
	void traverse()
	{
		node temp=tail.next;
		while(temp!=tail)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
		System.out.print(temp.data);

	}
}
class circularlinked
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		circularlinklist cll=new circularlinklist();
		cll.create();
		cll.create();
		cll.create();
		cll.traverse();
	}
}