package ProgrammingQuestions;

///import sun.awt.Mutex;

public class ThreadSequence {

	public static void main(String[] args) throws Exception 
	{

		Class1 c1=new Class1("Thread1", 1);
		Class1 c2=new Class1("Thread2", 2);
		Class1 c3=new Class1("Thread3", 3);
		Thread thread2 = new Thread(c2);
		thread2.start();
		Thread thread3 = new Thread(c3);
		thread3.start();
		Thread thread1 = new Thread(c1);
		thread1.start();

		thread1.join(); 
		thread2.join();
		thread3.join();
	}

}

class Class1 implements Runnable
{
	static String waitable = "WaitForMyTurn";
	static int count = 1;
	
	String threadName;
	int mycount;
	public Class1(String name, int count)
	{
		this.threadName = name;
		this.mycount = count;
	}
	public void run() 
	{
		synchronized(waitable)
		{
			while (count != mycount)
			{
				try {
					waitable.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread " + mycount + " : " + i);
			}
			count++;
			waitable.notifyAll();
		}
	}
}
