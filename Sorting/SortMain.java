package main;

import java.util.Scanner;

import com.search.SearchBinary;

import com.sortingClasses.Bubble;

import com.sortingClasses.Insertion;

import com.sortingClasses.Merge;

import com.sortingClasses.Selection;

public class SortArray 

{

        public static void main(String args[])

        {

                Bubble bubble = new Bubble();

                Selection selection = new Selection();

                Insertion insertion = new Insertion();

                Merge merge = new Merge();

                SearchBinary binary = new SearchBinary();

                Scanner s = new Scanner(System.in);

                int ar[] = {9,6,7,4,2,1,3,0};

                int ch = 0 ; 

                System.out.println("Sorting...");

                System.out.println("1. Bubble Sort");

                System.out.println("2. Selection Sort");

                System.out.println("3. Insertion sort");

                System.out.println("4. Merge sort");

                System.out.println("5. Binary search");

                System.out.println("Enter Choice");

                ch = s.nextInt();

                switch (ch)

                {

                case 1 :

                        ar = bubble.bubbleSort(ar);

                        for(int n : ar)

                                System.out.print(n+" ");

                        break;

                case 2:

                        ar = selection.SelectionSort(ar);

                        for(int n : ar)

                                System.out.print(n+" ");

                        break;

                case 3:

                        ar = insertion.InsetrionSort(ar);

                        for(int n : ar)

                                System.out.print(n+" ");

                        break;

                case 4:

                        ar = merge.mergeSort(ar);

                        for(int n : ar)

                                System.out.print(n+" ");

                        break;

                case 5:

                        System.out.println("Enter no to be found");

                        binary.binarySearch(ar, s.nextInt());

                        break;

                default:

                        System.out.println("Invalid choice");

                        break;

                }

                s.close();

        }

} 