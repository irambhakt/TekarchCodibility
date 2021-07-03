package ProgrammingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentsGrade {

	public static void main(String[] args) 
	{
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student("Tom", 101,55);
		Student s2 = new Student("Kacy",899,70);
		Student s3 = new Student("Pat",201,80);
		Student s4 = new Student("Peter",303, 90);
		Student s5 = new Student("Ross",505, 95);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		
		Collections.sort(list, new Comparator<Student>() {
			
			public int compare(Student s1, Student s2)
			{
				return  s2.getMarks() - s1.getMarks();
			}
		});
		
		for(int i = 1 ; i <= 3 ; i++)
		{
			System.out.println("Student With Rank "+i+ " is ::"+list.get(i-1));
		}
	}

}
