package com.sortingClasses;

public class Merge 

{

       public void merge(int ar[], int left[], int right[])

       {

              int i=0, j=0, k=0;

              while(i < left.length && j < right.length)

              {

                     if(left[i]<=right[j])

                     {

                           ar[k] = left[i];

                           i++;

                     }

                     else

                     {

                           ar[k] = right[j];

                           j++;

                     }

                     k++;

              }

              while(i < left.length)

              {

                     ar[k] = left[i];

                     i++;

                     k++;

              }

              while(j < right.length)

              {

                     ar[k] = right[j];

                     j++;

                     k++;

              }

       }

       

       public int[] mergeSort(int ar[])

       {

              if(ar.length < 2)

                     return ar;

              int size = ar.length/2;

              int j = 0;

              int left[] = new int[size];

              int right[] = new int[ar.length - size];

              for(int i = 0 ; i < (size); i++)

              {

                     left[i] = ar[i];

              }

              for(int i = size ; i < ar.length; i++)

              {

                     right[j] = ar[i];

                     j++;

              }

              mergeSort(left);

              mergeSort(right);

              merge(ar,left,right);

              return ar;

       }

} 