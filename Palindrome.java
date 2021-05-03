
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("m,a:d AM"));
	}
	
	public static boolean isPalindrome(String a) {
		a = a.toLowerCase();
		//a = a.replaceAll("[^a-z]", "");
		System.out.println(a);
		int i = 0;
		int j = a.length()-1;
		boolean flag = false;
		while(i<=j) {
			if(a.charAt(i) == a.charAt(j)) {
				i++;j--;
				flag = true;
			}
			else if(String.valueOf(a.charAt(i)) != "[a-z]") {
				i++;
			}
			else if(String.valueOf(a.charAt(j)) != "[a-z]") {
				j--;
			}
			else {
				flag = false;
				break;
			}
		}
		return flag;
		
	}

}
