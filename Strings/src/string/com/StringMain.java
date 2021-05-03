package string.com;
import java.util.Scanner;

public class StringMain {
	
	@SuppressWarnings("resource")
	public static void main(String agrs[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
	    String str = sc.nextLine();
	    while (true)
	    {
	    	StringManipulation sm = new StringManipulation();
			System.out.println("****STRING OPERATIONS****");
			System.out.println("1. find first non repeated element");
			System.out.println("2. Reverse String");
		    System.out.println("3. Check if String contains only digits");
		    System.out.println("4. Print duplicate characters");
		    System.out.println("5. Reverse words in a sentence");
		    System.out.println("6. Check any string for anagrams.");
		    System.out.println("7. Check any string if rotation?");
		    System.out.println("8. Check if string is a plaindrome");
		    System.out.println("9. Permutations of String"); 
		    System.out.println("0. Exit");
		    System.out.println("Enter your option: ");
		    int n = sc.nextInt();
		    
		    switch(n)
		    {
		    case 0:
		    	System.exit(0);
		    case 1:
		    	System.out.println("First nonRepeated Character is: " + sm.firstNonRepeated(str));
		    	break;
		    case 2:
		    	System.out.println("Reverse String = " + sm.reverseString(str));
		    	System.out.println("Reverse String = " + sm.reverseString1(str));
		    	break;
		    case 3:
		    	System.out.println("String contains only Digits: " + sm.containsOnlyDigits(str));
		    	System.out.println("String containsDigits: " + sm.stringContainsDigits(str));
		    	break;
		    case 4:
		    	System.out.println("Duplicate Characters in String are: " +sm.duplicateCharacters(str));
		    	break;
		    case 5:
		    	System.out.println("Reverse words: " + sm.reverseWord(str));
		    	break;
		    case 6:
		    	sc.nextLine();
		    	System.out.println("Enter 2nd string");
		    	String str1 = sc.nextLine();
		    	sm.checkAnagram(str,str1);
		    	break;
		    case 7:
		    	sc.nextLine();
		    	System.out.println("Enter 2nd string");
		    	String str2 = sc.nextLine();
		    	sm.checkRotation(str, str2);
		    	break;
		    case 8:
		    	sm.palindrome(str);
		    	break;
		    case 9:
		    	break;
		    default:
		    	System.out.println("Invalid choice");
		    	break;
		    }
		}    
	}
}
