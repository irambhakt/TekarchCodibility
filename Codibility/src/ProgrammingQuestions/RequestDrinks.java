package ProgrammingQuestions;

import java.util.Scanner;

public class RequestDrinks {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Drinks Type:: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter Quantity for drink "+ (i + 1) +" ::");
			arr[i] = sc.nextInt();
		}
		
		Drinks drink = new Drinks(n, arr);
		while(true)
		{
			System.out.print("Enter Drink Type(number from 1 to "+n+ ") :: ");
			int req = sc.nextInt();
			if(req == -1)
			{
				System.out.println("Bye!!");
				break;
			}
			drink.reqDrink(req);
		}
		
	}

}
