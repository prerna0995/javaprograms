
import java.io.*;
import java.util.*;


class Result {

	/*
	 * Complete the 'deviceNamesSystem' function below.
	 *
	 * The function is expected to return a STRING_ARRAY.
	 * The function accepts STRING_ARRAY devicenames as parameter.
	 */

	public static List<String> deviceNamesSystem(List<String> devicenames) {
		// Write your code here
		System.out.println(devicenames);
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		for(int i=0;i<devicenames.size();i++){

			if(map.containsKey(devicenames.get(i))){
				String s = devicenames.get(i).concat(String.valueOf(map.get(devicenames.get(i))+1));
				map.put(s, 0);
				map.put(devicenames.get(i),map.get(devicenames.get(i))+1);
			}
			else{
				map.put(devicenames.get(i),0);
			}
		}
		System.out.print("\nList of names\n");
//		for(Map.Entry<String,Integer> element : map.entrySet()){
//			System.out.println(element.getKey() + " -- " + element.getValue());
//		}

		List<String> list = new ArrayList<String>();

		for(Map.Entry<String,Integer> element : map.entrySet()){
			list.add(element.getKey());
//			String key = (String)element.getKey();
//			int v = (Integer)element.getValue();
//			if(v>1) {
//				while(v!=0) {
//					v--;
//					String value = v==0?"":String.valueOf(v);
//					String names = key.concat(value);
//					list.add(names);
//				}
//			}
//			else {
//				String value = v==1?"":String.valueOf(v);
//				String names = key.concat(value);
//				list.add(names);
//			}
		}
		return list;
	}

}
public class UniqueDevicenames {
	public static void main(String[] args) throws IOException {

		List<String> devicenames = new ArrayList<String>();
		devicenames.add("mixer");
		devicenames.add("toaster");
		devicenames.add("mixer");
		devicenames.add("tv");
		devicenames.add("mixer");
		devicenames.add("tv");

		List<String> l = Result.deviceNamesSystem(devicenames);
		System.out.println(l);

	}
}

