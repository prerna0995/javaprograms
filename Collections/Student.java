package model.student;
public class Student implements Comparable<Student>
{
	private int rollNo;
	private String name;
	private int marks;
	public Student()
	{
	}
	public Student(int rollNo, String name, int marks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this. marks = marks;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getMarks()
	{
		return marks;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	@Override
	public String toString()
	{
		return "rollNo=" + rollNo + ", name=" + name + ", marks=" + marks;
	}
	public int compareTo(Student o)
	{
		if(o.rollNo < rollNo)
			return 1;
		else if (o.rollNo > rollNo)
			return -1;
		else
			return 0;
	}
}