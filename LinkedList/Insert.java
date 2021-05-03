package com.functions;

import java.util.Scanner;

import com.model.LinkedList;

public class Insert extends LinkedList

{

        static Scanner s = new Scanner(System.in);

        public static void insertAtBegin()

        {

                int data;

                System.out.println("Enter data");

                data = s.nextInt();

                Node newNode = new Node();

                newNode.data = data;

                newNode.next = head;

                head = newNode;

                System.out.println("Element Inserted");

        }

        

        public static void insertAtMiddle()

        {

                int pos;

                int data;

                System.out.println("Enter position");

                pos = s.nextInt();

                if (pos == 1)

                {

                        insertAtBegin();

                        return;

                }

                System.out.println("Enter data");

                data = s.nextInt();

                Node newNode = new Node();

                newNode.data = data;

                Node current = head;

                

                for(int i = 1; i<pos-1 ;i++)

                {       

                        current = current.next;

                        if(current == null)  

            {

                System.out.println("can't insert");  

                return;  

            }

                }

                newNode.next= current.next;

                current.next = newNode;

                System.out.println("Element Inseterd");

                

        }

        

        public static void insertAtLast()

        {

                int data;

                System.out.println("Enter data");

                data = s.nextInt();

                Node newNode = new Node();

                newNode.data = data;

                Node current = head;

                while(current.next!= null)

                {

                        current = current.next;

                }

                newNode.next = null;

                current.next = newNode;

                System.out.println("Element Inseterd");

        }

} 