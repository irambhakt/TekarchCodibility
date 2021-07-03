package ProgrammingQuestions;

import java.util.Scanner;

public class MyCircularQueue 
{
	static int[] arr;
	static int n;
	int front = -1;
    int rear = -1;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value for Size Of Queue:: ");
		n = sc.nextInt();
		MyCircularQueue cc = new MyCircularQueue();
		arr = new int[n];
		cc.enqueue(100);
		cc.enqueue(236);
		cc.enqueue(245);
		cc.dequeue();
		cc.enqueue(356);
		cc.enqueue(345);
		cc.enqueue(769);
		cc.enqueue(900);
		cc.display();
	}
	private void display() 
	{
		if(empty())
		{
			return;
		}
		int frontIndex = front;
		while(true)
		{
			System.out.println(arr[frontIndex]);
			if(frontIndex == rear)
			{
				break;
			}
			frontIndex = nextValue(frontIndex);
		}
	}
	private void dequeue() 
	{
		System.out.println("FRONT:: "+front);
		if(empty())
		{
			return;
		}
		int x = arr[front];
		if(front == rear)
		{
			front = rear = -1;
		}
		else
		{
			front = nextValue(front);
		}
	}
	private int nextValue(int val) 
	{
		return (val + 1) % n;
	}
	private boolean empty() 
	{
		if(front == -1)
		{
			return true;
		}
		return false;
	}
	private void enqueue(int i) 
	{
		if(empty())
		{
			front = 0;
		}
		else if(full())
		{
			return;
		}
		rear = nextValue(rear);
		arr[rear] = i;
	}
	private boolean full() 
	{
		return (front == nextValue(rear));
	}

}
