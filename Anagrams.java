import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> dictionary= Arrays.asList("hack","a","rank","khac","ackh","kran","rankhacker","a","ab","ba","stairs","raits");
		List<String> query = Arrays.asList("a","nark","bs","hack","stair");
		//			    for (int i=0;i<dictionary.size();i++){
		//			        char ch[] = dictionary.get(i).toCharArray();
		//			        Arrays.sort(ch);
		//			        String s = new String(ch);
		//			        dictionary.set(i, s);
		//			    }
		//			    for (int i=0;i<query.size();i++){
		//			        char ch[] = query.get(i).toCharArray();
		//			        Arrays.sort(ch);
		//			        String s = new String(ch);
		//			        query.set(i, s);
		//
		//			    }
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(String st : dictionary){
			char[] ch1 = st.toCharArray();
			Arrays.sort(ch1);
			String str = new String(ch1);
			if(hm.containsKey(str)){
				hm.put(str, hm.get(str)+1);
			}
			else{
				hm.put(str, 1);
			}
		}
		List<Integer> anagram = new ArrayList<Integer>();

		for (String s : query){
			int count=0;
			char[] ch2 = s.toCharArray();
			Arrays.sort(ch2);
			String q = new String(ch2);
			for(Entry<String, Integer> entry : hm.entrySet()) {
				if(q.length() == entry.getKey().length() && q.equals(entry.getKey())){
					count = entry.getValue();
				} 
			}
			anagram.add(count);
		}
		Iterator<Integer> iterator = anagram.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}



