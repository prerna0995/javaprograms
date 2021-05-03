package treeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import model.student.Student;
public class TreeM 
{        
	Map〈Integer, Student〉 map = new TreeMap〈Integer, Student〉();
	public void createTree()
	{
		Student s1 = new Student(100, "ayush", 90);
		Student s2 = new Student(76, "aman", 54);
		Student s3 = new Student(162, "ajay", 35);
		Student s4 = new Student(91, "ravi", 98);
		map.put(s1.getMarks(), s1);
		map.put(s2.getMarks(), s2);
		map.put(s3.getMarks(), s3);
		map.put(s4.getMarks(), s4);
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext())
			{
				System.out.println(itr.next());
            }
	}
}