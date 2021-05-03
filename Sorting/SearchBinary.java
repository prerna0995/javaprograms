package com.search;

import com.sortingClasses.Merge;

public class SearchBinary 

{

       public void binarySearch(int ar[], int n)

       {

              Merge merge = new Merge();

              int ar1[] = merge.mergeSort(ar);

              for(int n1 : ar1)

                     System.out.print(n1+" ");

              int start = 0;

              int end = ar1.length - 1;

              int mid = ar1.length/2;

              while(end >= start)

              {

              if(n < ar1[mid])

              {

                     end = mid-1;

                     mid = (end + start)/2;

              }

              else if(n > ar1[mid])

              {

                     start = mid+1;

                     mid = (end + start)/2;

              }

              else{

                     System.out.println("No found at position = " + (mid + 1));

                     return;

              }

              }

              System.out.println("Not Found");

       }

} 