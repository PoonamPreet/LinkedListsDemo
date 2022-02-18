package sample;


public class CircularLinkedListDemo {
	//create a linked list by the basic concepts and objects which are available in java
	Node head,tail;
	class Node
	{
		int data;
		Node next;
		
		
		Node(int data)
		{
			this.data=data;
		}
	}
	//Inserting elements to the linked list
	void insertElements(int data)
	{
		Node newNode= new Node(data);
		if(head == null) 
		{
			head=newNode;
			tail=newNode;
			tail.next=newNode;//last node pointing to first node
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
			
		}
	}
	
	
	void displayElements()
	{
		Node n1=head;
		if(tail==null && head==null)
		{
			System.out.println("Circular Linked lsit is empty , nothing to display ");
		}
		else
		{
			do 
			{
				System.out.print(" "+n1.data);
				n1=n1.next;
			}while(n1!=head);
		}
	}
	
	
	void deleteElements()
	{
	if(tail!=head)
	{
		head=head.next;
		tail.next=head;
	}
	else
	{
		head=tail=null;
	}
	}
	
public static void main(String[] args) {
	CircularLinkedListDemo c1=new CircularLinkedListDemo();
	c1.insertElements(2);
	c1.insertElements(5);
	c1.insertElements(12);
	c1.displayElements();
	c1.deleteElements();
	c1.displayElements();
	
	}
}
