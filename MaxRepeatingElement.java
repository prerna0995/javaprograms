package org.restapi.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxRepeatingElement {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter array elements");
		for (int k = 0; k < n; k++) {
			a[k] = sc.nextInt();
		}
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		int max = 0;
		for(int i=0;i<n;i++) {
			if(map.get(a[i]) > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
