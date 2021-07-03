package ProgrammingQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class SortedSet 
{

	public static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception 
	{
		SortedSet set = new SortedSet();
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 5; i++)
		{
			System.out.print("Enter Value::");
			int n  = sc.nextInt();
			set.add(n);
		}
		for(int i : list)
		{
			System.out.println("item::"+i);
		}
	}

	private void add(int i) throws Exception 
	{
		if(list.isEmpty())
		{
			list.add(i);
			return;
		}
		
		int j = 0;
		for(j = 0 ; j < list.size() ; j++)
		{
			if (list.get(j) == i)
			{
				throw new Exception("Duplicate Entry Not Allowed:: "+list.get(j));
			}
			else if(list.get(j) > i)
			{
				break;
			}
		}
		list.add(j, i);
}

}
