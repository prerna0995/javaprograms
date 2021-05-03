package com.main;

import java.util.Scanner;

import com.functions.Delete;

import com.functions.OtherFunctions;

import com.functions.Insert;

import com.functions.Print;

import com.model.LinkedList;

public class Main 

{

        public static void main(String[] args) 

        {       

                Scanner s = new Scanner(System.in);

                int ch1=1;

                int ch2;

                while(ch1!=0)

                {

                        System.out.println("1. Insert Element");

                        System.out.println("2. Delete element");

                        System.out.println("3. Print list");

                        System.out.println("4. Find Middle element");

                        System.out.println("5. Check for circular linked list");

                        System.out.println("6. Reverse Linked List");

                        System.out.println("7. Delete Duplicates");

                        System.out.println("8. Find Nth element from last");

                        System.out.println("9. Create Loop");

                        System.out.println("10. Find Loop present or not");

                        System.out.println("11. Rotate right by k times");

                        System.out.println("0. Exit");

                        System.out.println("Enter choice");

                        ch1 = s.nextInt();

                        switch(ch1)

                        {

                        case 0:

                                System.exit(0);

                        case 1 : 

                                System.out.println("Enter Position to insert element");

                                System.out.println("1. At start");

                                System.out.println("2. At middle");

                                System.out.println("3. At last");

                                ch2 = s.nextInt();

                                switch(ch2)

                                {

                                case 1:

                                        Insert.insertAtBegin();

                                        break;

                                case 2:

                                        Insert.insertAtMiddle();

                                        break;

                                case 3:

                                        Insert.insertAtLast();

                                        break;

                                default:

                                        System.out.println("Invalid choice");

                                        break;

                                }

                                break;

                        case 2:

                                System.out.println("Enter Position to delete element");

                                System.out.println("1. At start");

                                System.out.println("2. At middle");

                                System.out.println("3. At last");

                                System.out.println("4. By key");

                                ch2 = s.nextInt();

                                switch(ch2)

                                {

                                case 1:

                                        Delete.deleteAtBegin();

                                        break;

                                case 2:

                                        Delete.deleteAtMiddle();

                                        break;

                                case 3:

                                        Delete.deleteAtLast();

                                        break;

                                case 4:

                                        Delete.deleteByKey();

                                        break;

                                default:

                                        System.out.println("Invalid choice");

                                        break;

                                }

                                break;

                        case 3:

                                Print.printList();

                                break;

                        case 4:

                                OtherFunctions.findMiddle();

                                break;

                        case 5: 

                                OtherFunctions.checkForCircularLL();

                                break;

                        case 6:

                                OtherFunctions.reverseList();

                                break;

                        case 7:

                                OtherFunctions.deleteDuplicate();

                                break;

                        case 8:

                                int n;

                                System.out.println("Enter value of N");

                                n = s.nextInt();

                                OtherFunctions.nthElementFromLast(n);

                                break;

                        case 9:

                                System.out.println("Creating loop");

                                OtherFunctions.createLoop();

                                break;

                        case 10:

                                System.out.println("1. By HashSet method");

                                System.out.println("2. By Floyd Cycle finding algo");

                                ch2 = s.nextInt();

                                switch(ch2)

                                {

                                case 1:

                                        OtherFunctions.findLoop1(LinkedList.head);

                                        break;

                                case 2:

                                        OtherFunctions.findLoop2();

                                        break;

                                default:

                                        System.out.println("Invalid choice");

                                        break;

                                        }

                        case 11:

                                System.out.println("Enter value of k");

                                ch2 = s.nextInt();

                                OtherFunctions.rotateRight(ch2);

                                break;

                        default:

                                System.out.println("Invalid choice");

                                break;

                        }

                }

                s.close();

        }

} 