package hashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import model.student.Student;
public class HashM 
{
	Map〈Integer,Student〉 map = new HashMap〈Integer,Student〉();
	public void putMap()
	{
		Student s1 = new Student(100, "ayush", 90);
		Student s2 = new Student(76, "aman", 54);
		Student s3 = new Student(162, "ajay", 35);
		Student s4 = new Student(91, "ravi", 98);
		map.put(s1.getRollNo(), s1);
		map.put(s2.getRollNo(), s2);
		map.put(s3.getRollNo(), s3);
		map.put(s4.getRollNo(), s4);
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry e = (Entry)itr.next();
			System.out.println(e.getValue());
        }
//             for(Entry m : map.entrySet())
//             {
//                     System.out.println(m.getValue());
//             }                                
//             Set〈Entry〈Integer, Student〉〉 set = map.entrySet();
//             Iterator〈Entry〈Integer, Student〉〉 itr = set.iterator();
//             while(itr.hasNext())
//             {
//                     Entry〈Integer, Student〉 e = itr.next();
//                     System.out.println(e.getValue());
//             }                                                                                
		/*public static void main(String args[])                
		{                        
			Map〈String , String〉 map = new ConcurrentHashMap〈String, String〉();
			map.put("1", "a");
			map.put("2", "b");
			map.put("3", "c");
			map.put("4", "d");
			Set〈Entry〈String, String〉〉 set = map.entrySet();
			Iterator〈Entry〈String, String〉〉 itr = set.iterator();
			while(itr.hasNext())
			{
				Entry〈String, String〉 entry = itr.next();
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
				map.put(entry.getValue(), entry.getKey());
				map.remove(entry.getKey());
			}
			System.out.println();
			Set〈Entry〈String, String〉〉 set1 = map.entrySet();
			Iterator〈Entry〈String, String〉〉 itr1 = set1.iterator();
			while(itr1.hasNext())
			{
				Entry〈String, String〉 entry = itr1.next();
				System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
			}*/
	}
}