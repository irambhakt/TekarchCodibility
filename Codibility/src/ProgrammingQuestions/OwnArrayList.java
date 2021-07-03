package ProgrammingQuestions;

import java.util.Arrays;

public class OwnArrayList {

	static int cap = 10;
	static Student arr[] = new Student[cap];
	int size = 0;
	public static void main(String[] args) 
	{
		OwnArrayList list = new OwnArrayList();
		Student s1 = new Student("Tom",101,45);
		Student s2 = new Student("James",102,57);
		Student s3 = new Student("Peter",103,57);
		Student s4 = new Student("Joey",104,87);
		Student s5 = new Student("Ross",105,90);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		for(Student s : arr)
		{
			if(s != null)
			{
				System.out.println(s.toString());
			}	
		}
	}
	private void add(Student s) 
	{
		if(size < cap)
		{
			arr[size++] = s;
		}
		else
		{
			Student newArr[] = new Student[2 * cap];
			cap = newArr.length;
			size = 0;
			for(Student su : arr)
			{
				newArr[size++] = su;
			}
			newArr[size++] = s;
			arr = newArr;
		}
	}

	private void remove(Student s) 
	{
		for(int i = 0 ; i < size ; i++)
		{
			if(arr[i] == s)
			{
				int j;
				for(j = i ; j < arr.length - 1 ; j++)
				{
					arr[j] = arr[j + 1];
				}
				arr[j] = null;
				size--;
			}
		}
	}

}
