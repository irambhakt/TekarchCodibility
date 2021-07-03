package ProgrammingQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PriorityQueue 
{

	List<Student> list = new ArrayList<Student>();
	public static void main(String[] args) 
	{
		
		Student s1 = new Student("Tom", 101,55);
		Student s2 = new Student("Kacy",899,70);
		Student s3 = new Student("Pat",201,80);
		Student s4 = new Student("Peter",600, 90);
		Student s5 = new Student("Ross",505, 95);
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.enqueue(s1);
		pq.enqueue(s2);
		pq.enqueue(s3);
		pq.enqueue(s4);
		pq.enqueue(s5);
		pq.display();
		pq.dequeue();
		pq.display();
		pq.dequeue();
		pq.display();
		System.out.println("Peeked:: "+pq.peekMin().toString());
		
		
	}
	private Student peekMin() 
	{
		return list.get(0);
	}
	private void dequeue() 
	{
		if(list.isEmpty())
		{
			return;
		}
		list.remove(list.get(0));
	}
	private void display() 
	{
		System.out.println("DISPLAY!!!");
		for(Student s : list)
		{
			System.out.println(s.toString());
		}
		
	}
	private void enqueue(Student s) 
	{
		if(list.isEmpty())
		{
			list.add(s);
			return;
		}
		for(int i = 0 ; i < list.size(); i++)
		{
			if(list.get(i).getRegNo() > s.getRegNo())
			{
				list.add(i,s);
				return;
			}
		}
		list.add(s);
	}

}
