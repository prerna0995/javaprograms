package treeSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import model.student.Student;
public class TreeS{        
public void createTree()        
{                
	TreeSet<Student> tree = new TreeSet<Student>();                
	Student s1 = new Student(100, "ayush", 90);                
	Student s2 = new Student(76, "aman", 54);                
	Student s3 = new Student(162, "ajay", 35);                
	Student s4 = new Student(91, "ravi", 98);                
	tree.add(s1);                
	tree.add(s2);                
	tree.add(s3);                
	tree.add(s4);                
	//             for(Student s : tree)
	//             {
		//                     System.out.println(s);
		//         }                                
		Iterator i = tree.descendingIterator();                                
		while(i.hasNext()){                                        
		System.out.println(i.next());                                
		}        
	}
}