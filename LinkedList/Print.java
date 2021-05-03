package com.functions;

import com.model.LinkedList;

public class Print extends LinkedList

{

    public static void printList()

   {

		Node current = head;

        if(head == null)

        {

			System.out.println("Empty list");

            return;

        }

        while(current!= null)

        {

			System.out.print(current.data+" ");

            current = current.next;

        }

        System.out.println();

       }

} 