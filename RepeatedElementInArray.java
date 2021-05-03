package org.restapi.demo;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedElementInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		int a[] = new int[n];
//		int temp[] = new int[n];
//		int k=0;
		System.out.println("enter array elements");
		for (int k = 0; k < n; k++) {
			a[k] = sc.nextInt();
		}
		//Arrays.sort(a);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i] == a[j] )
				{
					System.out.println(a[j]);
				}
			}
		}
		
	}
}
