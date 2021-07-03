package ProgrammingQuestions;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedList {

	List<Node> arrList = new ArrayList<>();
	Node head = null;
	public static void main(String[] args) 
	{
		
		MyLinkedList list = new MyLinkedList();
		Node n1 = new Node(100);
		Node n2 = new Node(102);
		Node n3 = new Node(143);
		Node n4 = new Node(678);
		Node n5 = new Node(190);
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		list.display();
		list.delete(143);
		System.out.println("After deletion");
		list.display();
		
		
	}
	private void delete(int value) 
	{
		Node prev = null;
		Node current = head;
		
		while (current != null && current.value != value)
		{
			prev = current;
			current = current.next;
		}
		
		// not found
		if (current == null)
		{
			return;
		}
		
		// found
		if (current == head)
		{
			head = head.next;
			return;
		}
		
		prev.next = current.next;
	}
	
	private void display() 
	{
		Node start = head;
		while(start!= null)
		{
			System.out.println(start.value);
			start = start.next;
		}
	}
	
	private void add(Node n1) 
	{
		if(head == null)
		{
			head = n1;
		}
		else
		{
			Node pt = head;
			while(pt.next != null)
			{
				pt = pt.next;
			}
			pt.next = n1;
		}
	}

}
