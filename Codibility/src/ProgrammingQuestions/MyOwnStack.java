package ProgrammingQuestions;

import java.util.ArrayList;
import java.util.List;

public class MyOwnStack {

	List<Object> list = new ArrayList<>();
	public static void main(String[] args)
	{
		
		MyOwnStack stack = new MyOwnStack();
		stack.push(10);
		stack.push(30);
		stack.push(49);
		stack.push("stack");
		stack.push("Java");
		System.out.println("Poped:: "+stack.pop());
		System.out.println("On Top:: "+ stack.peek());
		stack.push("Code");
		stack.display();
		
	}

	private void display() 
	{
		for(int i = list.size() - 1; i >= 0 ; i--)
		{
			System.out.println(list.get(i));
		}
	}

	private Object peek() 
	{
		return list.get(list.size() - 1);
	}

	private Object pop() 
	{
		return list.remove(list.size() - 1);
	}

	private void push(Object i) 
	{
		list.add(i);
	}

}
