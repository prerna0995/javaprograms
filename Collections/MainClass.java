package main;
import java.util.Scanner;
import treeMap.TreeM;
import treeSet.TreeS;
import arrayList.Array;
import hashMap.HashM;
import hashSet.HashS;
public class MainClass 
{
	public static void main(String[] args)
	{
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		Array ar = new Array();
		HashS hs = new HashS();
		HashM hm = new HashM();
		TreeS ts = new TreeS();
		TreeM tm = new TreeM();
		System.out.println("1. Create List");
		System.out.println("2. Create HashMap");
		System.out.println("3. create hashset");
		System.out.println("4. Create TreeSet");
		System.out.println("5. Create TreeMap");
		System.out.println("Select your choice");
		ch = sc.nextInt();
		switch (ch)
		{
			case 1:
			ar.createList();
			break;
			case 2:
			hm.putMap();
			break;
			case 3 :
			hs.putMap();
			break;
			case 4:
			ts.createTree();
			break;
			case 5:
			tm.createTree();
			break;
			default:
			System.out.println("Invalid choice");
		}
		sc.close();
    }
}