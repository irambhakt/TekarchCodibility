package ProgrammingQuestions;

import java.util.Comparator;

public class Student implements Comparator<Student>
{
	private String name;
	private int regNo;
	private int marks;
	public Student()
	{
		
	}
	public int getMarks() 
	{
		return marks;
	}
	public void setMarks(int marks) 
	{
		this.marks = marks;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getRegNo() 
	{
		return regNo;
	}
	public void setRegNo(int regNo) 
	{
		this.regNo = regNo;
	}
	public Student(String name, int regNo) 
	{
		super();
		this.name = name;
		this.regNo = regNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", regNo=" + regNo + ", marks=" + marks + "]";
	}
	public Student(String name, int regNo, int marks) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.marks = marks;
	}
	
	@Override
	public int compare(Student o1, Student o2)
	{
		return o1.getRegNo() - o2.getRegNo();
	}
}
