package ProgrammingQuestions;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount in cents:: ");
		int amount = sc.nextInt();
		int arr[]= {1,5,10,25,100};
		int count = 0;
		
		for(int i = arr.length - 1; i >= 0 ; i--)
		{
			int q = amount / arr[i];
			count = count + q;
			amount = amount % arr[i];
		}
		
		System.out.println("The minimum Numbers of Coins are:: "+count);
	}

}
