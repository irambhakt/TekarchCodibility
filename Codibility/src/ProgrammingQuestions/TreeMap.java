package ProgrammingQuestions;

public class TreeMap {

	public static void main(String[] args) 
	{
		java.util.TreeMap<Integer, Student> map = new java.util.TreeMap<Integer, Student>();
		Student s1 = new Student("Joey", 10);
		Student s2 = new Student("Kathy", 30);
		Student s3 = new Student("John", 50);
		Student s4 = new Student("Raj", 40);
		Student s5 = new Student("Tom", 20);
		map.put(101, s1);
		map.put(102, s2);
		map.put(103, s3);
		map.put(104, s4);
		map.put(105, s5);
		
	}

}
