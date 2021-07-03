package ProgrammingQuestions;

import java.util.LinkedList;

public class DoubleEndedQueue {

	LinkedList<Integer> ll = new LinkedList<Integer>();
	public static void main(String[] args) 
	{
		DoubleEndedQueue dq = new DoubleEndedQueue();
		dq.addToFront(10);
		dq.addToLast(100);
		dq.addToFront(200);
		dq.addToLast(5000);
		dq.addToFront(298);
		dq.display();
		//dq.removeFromFirst();
		//dq.removeFromLast();
		
	}
	private void display()
	{
		for(Integer i : ll)
		{
			System.out.println(i);
		}
	}
	private void removeFromLast() 
	{
		ll.removeLast();
	}
	private void removeFromFirst() 
	{
		ll.removeFirst();
	}
	private void addToLast(int n) 
	{
		ll.addLast(n);
	}
	private void addToFront(int n) 
	{
		ll.addFirst(n);
	}

}
