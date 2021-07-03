package ProgrammingQuestions;

import java.util.Scanner;

public class Vector {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value for n:: ");
		int n = sc.nextInt();
		
		 java.util.Vector<Character> vec = new java.util.Vector<Character>();
		 
		 String str = "tekarch";
		 for(int i = 0 ; i < str.length() ; i++)
		 {
			 vec.add(str.charAt(i));
		 }
		 
		 for(int i = 3 ; i < 3 + n ;i++)
		 {
			 vec.add(i, 'Z');
		 }
		 
		 for(int i = 0 ; i < n ;i++)
		 {
			 vec.removeElementAt(6);
		 }
		 
		 String res = "";
		 for(Character ch : vec)
		 {
			 res = res + Character.toString(ch);
		 }
		 
		 System.out.println("Final String:: "+res);
	}

}
