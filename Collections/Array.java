package arrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import compare.MarksCompare;
import model.student.Student;
public class Array 
{
	@SuppressWarnings("unchecked")
	public  void createList()
	{
		Student s1 = new Student(100, "ayush", 90);
		Student s2 = new Student(76, "aman", 54);
		Student s3 = new Student(162, "ajay", 35);
		Student s4 = new Student(91, "ravi", 98);
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("After sorting with comparable");
		Collections.sort(list);
		for(Student s : list)
		{ 
			System.out.println(s);
		}
		System.out.println();
		System.out.println("After sorting with comparator");
		Collections.sort(list, new MarksCompare());
		for(Student s : list)
		{
			System.out.println(s);
		}        
	}
}