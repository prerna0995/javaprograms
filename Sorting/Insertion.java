package com.sortingClasses;

public class Insertion 

{

       public int[] InsetrionSort(int[] ar)

       {

              int hole;

              int value;

              for(int i = 1; i <= ar.length ; i++)

              {      value = ar[i];

                     hole = i;

                     while(hole > 0 && (value < ar[hole-1]))

                     {

                           ar[hole] = ar[hole-1];

                           hole--;

                     }

                     ar[hole] = value;

              }

              return ar;

       }

} 