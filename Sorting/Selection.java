package com.sortingClasses;

public class Selection 

{

       public int[] SelectionSort(int[] ar)

       {

              int min;

              for(int i = 0; i < ar.length - 1 ; i ++)

              {

                     min = i;

                     for(int j = i+1 ; j < ar.length; j++)

                     {

                           if(ar[j] < ar[min])

                           {

                                  min = j;

                           }

                     }

                     int temp;

                     temp = ar[i];

                     ar[i] = ar[min];

                     ar[min] = temp;

              }

              return ar;

       }

} 