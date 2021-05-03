package com.functions;

import java.util.HashSet;

import com.model.LinkedList;

public class OtherFunctions extends LinkedList

{

        public static void findMiddle()

        {

                Node node = head;

                Node middle = head;

                while(node != null && node.next != null)

                {

                        node = node.next.next;

                        middle = middle.next;

                }

                System.out.println("Middle element is : " +middle.data);

        }

        

        public static void checkForCircularLL()

        {

                Node node = head;

                while(node.next!=null)

                {

                        if(node.next == head)

                        {

                                System.out.println("circular linked list");

                                return;

                        }

                        node = node.next;

                }

                System.out.println("Not a cicular linked list");

        }

        

        public static void reverseList()

        {

                Node fwd = head.next;

                Node temp = head;

                if(head.next == null)

                {

                        System.out.println("only single element");

                        return;

                }

                head.next = null;      

                while(fwd.next!=null)

                {

                        

                        temp = fwd.next;

                        fwd.next = head;

                        head = fwd;

                        fwd = temp;

                }

                fwd.next = head;

                head = fwd;

                System.out.println("Linked list reversed");

        }

        public static void deleteDuplicate()

        {

                Node node1 = head;

                Node node2 = head;

                while(node1 !=null && node1.next != null)

                {

                        node2 = node1;

                        while(node2 !=null && node2.next != null)

                        {

                                if(node1.data == node2.next.data)

                                {

                                        node2.next = node2.next.next;

                                }

                                node2 = node2.next;

                        }

                        node1 = node1.next;

                }

                System.out.println("Duplicates deleted");

        }

        

        public static void nthElementFromLast(int pos)

        {

                int n = pos;

                int len=0;

                Node node = head;

                while(node != null)

                {

                        len++;

                        node =node.next;

                }

                if(len<n)

                {

                        System.out.println("length is smaller than value entered");

                        return;

                }

                node = head;

                for(int i = 0 ; i < len - n ; i++)

                {

                        node = node.next;

                }

                System.out.println(node.data);

        }
		
		public static void findLoop1(Node node)

        {

                HashSet<Node> hash = new HashSet<Node>();

                while(node != null)

                {

                        if(hash.contains(node))

                        {

                                System.out.println("Loops");

                                return;

                        }

                        hash.add(node);

                        node = node.next;

                }

                System.out.println("No Loop");

        }

        

        public static void findLoop2()

        {

                Node slow = head;

                Node fast = head;

                while(slow != null && fast != null && fast.next != null)

                {

                        slow = slow.next;

                        fast = fast.next.next;

                        if(slow == fast)

                        {

                                System.out.println("Loops");

                                return;

                        }

                }

                System.out.println("No loops");

        }

        

        public static void createLoop()

        {

                head.next.next.next.next = head.next;

        }

        public static void rotateRight(int ch2) 

        {

                Node node = null;

                for(int i = 0 ; i < ch2; i++)

                {

                        node = head;

                        while(node.next.next!=null)

                        {

                                node = node.next;

                        }

                        node.next.next = head;

                        head = node.next;

                        node.next = null;

                }

                Print.printList();

        }

} 