package hashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import model.student.Student;
public class HashS
{        
	Set<Student> set = new HashSet<Student>();
    public void putMap()
	{
		Student s1 = new Student(100, "ayush", 90);
		Student s2 = new Student(76, "aman", 54);
		Student s3 = new Student(162, "ajay", 35);
		Student s4 = new Student(91, "ravi", 98);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		for(Student s : set)
		{
			System.out.println(s);
        }
	}                               
}