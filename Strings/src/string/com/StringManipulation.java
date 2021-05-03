package string.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringManipulation {
	
	public char firstNonRepeated(String str){
		str = str.replaceAll(" ", "");
		char nonRepeat = '\0';
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0; i<str.length(); i++){
			if(hm.containsKey(str.charAt(i))){
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
			else{
				hm.put(str.charAt(i), 1);
			}
		}
		for(int i=0; i<str.length(); i++){
			if(hm.get(str.charAt(i)) == 1){
				nonRepeat = str.charAt(i);
				break;
			}
		}
		return nonRepeat;
	}
	
	public String reverseString(String str){
        String reverse="";
        for(int i = str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
	
	public String reverseString1(String str) {
       String reverse = "";
       String word[] = str.split(" ");
       for(int i=word.length-1; i>= 0; i--){
           reverse = reverse + word[i] + " ";
       }
       return reverse;
    }
	
	public boolean stringContainsDigits(String str){
		boolean bool = false;
		for(int i=0; i<str.length(); i++){
			if(Character.isDigit(str.charAt(i))){
				bool = true;
				break;
			}
		}
		return bool;
	}
	
	public boolean containsOnlyDigits(String str){
		return str.matches("[0-9]+");
	}
	
	public Set<Character> duplicateCharacters(String str){
		str = str.replaceAll(" ","");
		HashSet<Character> set = new HashSet<Character>();
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i=0; i<str.length(); i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else{
				map.put(str.charAt(i), 1);
			}
		}
		for(int i=0; i<str.length(); i++){
			if(map.get(str.charAt(i)) > 1){
				set.add(str.charAt(i));
			}
		}
		return set;
	}
	
    
    public String reverseWord(String str) {
       String reverseString = "";
       String word[] = str.split(" ");
       for(int i=0; i<word.length; i++){
           String s = word[i];
           String reverse = "";
           for(int j=s.length()-1; j>=0; j--){
               reverse = reverse + s.charAt(j); 
           }
           reverseString = reverseString + reverse + " ";
       }
       return reverseString;
    }
    
    public void palindrome(String str){
        String reverse="";
        for(int i = str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Palindrome String");
        }
        else
        {
        	System.out.println("Not a Palindrome String");
        }
    }

	public void checkAnagram(String str, String str1) {
		if(str.length() != str1.length()){
			System.out.println("Not Anagrams");
			return;
		}
		char a[] = str.toCharArray();
		char b[] = str1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0; i<a.length; i++){
			if( a[i] != b[i] ){
				System.out.println("Not Anagrams");
				return;
			}
		}
		System.out.println("Anagrams");
	}

	public void checkRotation(String str, String str2) {
		if(str.length() != str2.length()){
			System.out.println("Not a Rotation of 1st string");
			return;
		}
		str = str.concat(str2);
		if(str.contains(str2))
			System.out.println("Rotation of 1st string");
		else
			System.out.println("Not a Rotation of 1st string");
	}
	
	public void substringOfString(String str){
		for(int i = 0; i<str.length(); i++){
			for(int j=i+1;j<=str.length();j++){
				System.out.println("substringOfString = " + (str.substring(i,j)));
			}
		}
	}

}
