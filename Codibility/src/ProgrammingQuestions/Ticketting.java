package ProgrammingQuestions;

public class Ticketting {
	public Integer MaxTickets;
	public Ticketting(int maxTickets)
	{
		MaxTickets = maxTickets;
	}
	
	public boolean Book(int n)
	{
		synchronized (MaxTickets) {
			if (MaxTickets >= n)
			{
				MaxTickets -= n;
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Ticketting ticketting = new Ticketting(13);
		
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Ticketter("T1", 4, ticketting));
		Thread t2 = new Thread(new Ticketter("T2", 2, ticketting));
		Thread t3 = new Thread(new Ticketter("T3", 5, ticketting));
		Thread t4 = new Thread(new Ticketter("T4", 4, ticketting));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
	}

}

class Ticketter implements Runnable
{
	String name;
	int ticketsCount;
	Ticketting ticketting;
	public Ticketter(String name, int ticketsCount, Ticketting ticketting)
	{
		this.name = name;
		this.ticketsCount = ticketsCount;
		this.ticketting = ticketting;
	}
	public void run() {
		System.out.println(name + " trying to book " + ticketsCount + " tickets");
		if (ticketting.Book(ticketsCount))
		{
			System.out.println(name + " BOOKED " + ticketsCount + " tickets");
		}
		else
		{
			System.out.println(name + " FAILED to book " + ticketsCount + " tickets");				
		}
		
	}
}