package ProgrammingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDupFromArrayList {

	public static void main(String[] args) 
	{
		List<Employees>list = new ArrayList<Employees>();
		Employees e1 = new Employees(101, "Kim", 40000);
		Employees e2 = new Employees(141, "Ken", 30000);
		Employees e3 = e2;
		Employees e4 = new Employees(231, "Lenord", 40000);
		Employees e5 = new Employees(891, "Penny", 90000);
		Employees e6 = e5;
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		List<Employees> list2 = new ArrayList<Employees>();
		System.out.println("Before Removing Duplicates!! \n==================================================");
		for(Employees e : list)
		{
			System.out.println(e.toString());
			if(!list2.contains(e))
			{
				list2.add(e);
			}
		}
		
		System.out.println("\n\nAfter Removing Duplicates!! \n===================================================");
		for(Employees e : list2)
		{
			System.out.println(e.toString());
		}
		
	}

}
