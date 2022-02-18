package sample;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
public class LinkedListsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<>();
		//adding elements to linked list
		l1.add(3);//regular add method
		l1.add(5);
		l1.add(15);
		l1.add(18);
		l1.add(1, 6);//updation using index
		
		
		//removal of elements from linked list
		//l1.remove();//removes all elements
		l1.remove(2);//remove using index
		//l1.removeFirst();
		//l1.removeLast();
		
		
		//accessing elements of linked list using iterator
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		//size of linked list
		System.out.println();
			System.out.println(l1.size());
			
			
		//searching elements of linked list
   		boolean b1=l1.contains(18);
		System.out.println(b1);
			
		//copy elements from stack to linked list
		Stack<String> s1=new Stack<>();
		LinkedList<String> l2=new LinkedList<>();
		s1.push("Hello");
		s1.push("How");
		s1.push("are");
		s1.push("you");
		
		//copying
		l2.addAll(s1);
		
		
		Iterator it1=l2.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next()+" ");
		}
		
		
	}

}
