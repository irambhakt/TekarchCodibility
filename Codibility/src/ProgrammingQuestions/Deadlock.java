package ProgrammingQuestions;

import java.util.concurrent.locks.ReentrantLock;


public class Deadlock {
	ReentrantLock a = new ReentrantLock();
	ReentrantLock b = new ReentrantLock();
	
	public void Sleep(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void deadlock1(String name)
	{
		System.out.println(name + " trying to synchronize with a");
		a.lock();
		System.out.println(name + " synchronized with a");
		Sleep(1000);
		System.out.println(name + " trying to synchronize with b");
		b.lock();
		System.out.println(name + " synchronized with b");
		b.unlock();
		a.unlock();
	}

	void deadlock2(String name)
	{
		System.out.println(name + " trying to synchronize with b");
		b.lock();
		System.out.println(name + " synchronized with b");
		Sleep(1000);
		System.out.println(name + " trying to synchronize with a");
		a.lock();
		System.out.println(name + " synchronized with a");
		a.unlock();
		b.unlock();
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Deadlock d = new Deadlock();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				d.deadlock1("Thread1");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				d.deadlock2("Thread2");
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}

