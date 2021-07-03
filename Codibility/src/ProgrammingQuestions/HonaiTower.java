package ProgrammingQuestions;

import java.util.Scanner;

public class HonaiTower {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Entere The Value for n:: ");
		int n = sc.nextInt();
		towerOfHanoi(n,'A','C','B');
		
	}

	private static void towerOfHanoi(int n, char from, char to , char aux) 
	{
		if(n == 1)
		{
			System.out.println("Move disk 1 from rod "+from+ " to rod "+to);
			return;
		}
		
		towerOfHanoi(n - 1,from, aux,to);
		System.out.println("Move disk "+n+ " from rod "+from + " to rod "+to);
		towerOfHanoi(n - 1, aux, to, from);
	}

}
