package org.restapi.demo;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(balanced(str));
			
		
	}
	public static boolean balanced(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(ch == '[' || ch == '{' || ch == '(')
			{
				stack.push(ch);
			}
			else if(ch == ']') {
				if(stack.isEmpty() || stack.pop() != '[')
					return false;
			}
			else if(ch == '}') {
				if(stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}
			else if (ch ==')') {
				if(stack.isEmpty() || stack.pop() != '(')
					return false;
			}
		}
		return stack.isEmpty();
	}
}