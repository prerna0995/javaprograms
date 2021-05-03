package com.sortingClasses;

public class Bubble 

{

       public int[] bubbleSort(int[] ar)

       {

              boolean flag = false;

              for(int i = 0; i < ar.length - 1 ; i ++)

              {

                     flag = false;

                     for(int j = 0 ; j < ar.length - i - 1 ; j++)

                     {

                           if (ar[j] > ar [j+1])

                           {

                                  int temp;

                                  temp = ar[j];

                                  ar[j] = ar[j+1];

                                  ar[j+1] = temp;

                                  flag = true;

                           }

                     }

                     if(!flag)

                           return ar;

              }

              return ar;

       }

} 