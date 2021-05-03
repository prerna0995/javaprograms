package com.functions;

import java.util.Scanner;

import com.model.LinkedList;

public class Delete extends LinkedList

{

        static Scanner s = new Scanner(System.in);

        public static void deleteAtBegin()

        {

                Node node = head;

                head = node.next;

                System.out.println("Element Deleted");

        }

        public static void deleteAtMiddle()

        {

                int pos;

                System.out.println("Enter position");

                pos = s.nextInt();

                if (pos == 1)

                {

                        deleteAtBegin();

                        return;

                }

                Node current = head;

                Node prev=head;

                for(int i = 1; i<pos-1;i++)

                {

                        prev.next = current;

                        current = current.next;

                        if(current == null)  

                        {

                                System.out.println("can't delete");  

                                return;  

                        }

                        

                }

                prev = current.next;

                System.out.println("Element deleted");

        }

        public static void deleteAtLast()

        {

                Node current = head;

                System.out.println("current = "+head);

                System.out.println("data = "+ head.data);

                System.out.println("data next= "+ head.next.data);

                System.out.println("next = " +head.next);

                Node prev=head;

                if(current.next==null)

                {

                        head = null;

                        System.out.println("element deleted");

                        return;

                }

                while(current.next != null)

                {

                        prev = current;

                        current = current.next;

                }

                prev.next = null;

                System.out.println("Element deleted");

        }

        public static void deleteByKey()

        {

                int data;

                System.out.println("Enter data");

                data = s.nextInt();

                Node current = head;

                Node prev=head;

                while(current.next!= null)

                {

                        if(current.data == data)

                        {

                                prev.next = current.next;

                                System.out.println("Element deleted");

                                return;

                        }

                        prev = current;

                        current = current.next;        

                }

                if(current.next==null && current.data == data)

                {

                        prev.next=null;

                        System.out.println("Element deleted");

                        return;

                }

                System.out.println("element not  found");

        }

} 