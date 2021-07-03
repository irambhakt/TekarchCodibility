package ProgrammingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> st = new Stack<>();
	public static void main(String[] args) 
	{
		QueueUsingStack qq = new QueueUsingStack();
		qq.push(1);
		qq.push(2);
		qq.push(3);
		qq.push(4);
		qq.display();
		qq.pop();
		qq.display();
		qq.pop();
		qq.display();
		//qq.pop();
	}
	private void display() 
	{
		System.out.println("DISPLAY!!!!");
		for(int i = 0 ; i < st.size() ; i++)
		{
			System.out.println(st.get(i));
		}
	}
	private void pop()
	{
		if(st.empty())
		{
			return;
		}
		st.pop();
	}
	private void push(int i) 
	{
		if(st.empty())
		{
			st.push(i);
			return;
		}
		List<Integer> list = popAllElements();
		st.push(i);
		addAllElementsToStack(list);
	}
	private void addAllElementsToStack(List<Integer> list) 
	{
		for(int i = list.size() - 1; i >= 0 ; i--)
		{
			st.push(list.get(i));
		}
	}
	private List<Integer> popAllElements() 
	{
		List<Integer> l = new ArrayList<Integer>();
		while(st.size() != 0)
		{
			l.add(st.pop());
		}
		return l;
	}

}
