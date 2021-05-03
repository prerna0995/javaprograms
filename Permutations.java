
public class Permutations {

	public static void permutations(String str, int startIndex, int endIndex)
	{
		if(startIndex == endIndex)
		{
			System.out.println(str);
		}
		else
		{
			for (int i = startIndex; i <= endIndex; i++) 
			{ 
				str = swap(str,startIndex,i); 
				permutations(str, startIndex+1, endIndex); 
				str = swap(str,startIndex,i); 
			} 
		}
	}
	
	public static String swap(String str, int startIndex, int endIndex)
	{
		char temp; 
		char[] charArray = str.toCharArray(); 
		temp = charArray[startIndex] ; 
		charArray[startIndex] = charArray[endIndex]; 
		charArray[endIndex] = temp; 
		return String.valueOf(charArray); 
	}
	
	public static void main(String[] args) {
		String str = "abc";
		Permutations.permutations(str, 0, str.length()-1);
	}
}

