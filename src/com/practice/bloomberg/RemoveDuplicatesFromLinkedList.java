package com.practice.bloomberg;

import java.util.HashMap;

/*
 * 

 Sorted and Unsorted Linked List

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,

Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

Write a removeDuplicates() function which takes a list and deletes any duplicate 
nodes from the list. The list is not sorted.

For example if the linked list is 12->11->12->21->41->43->21 then removeDuplicates() 
should convert the list to 12->11->21->41->43.
 */

public class RemoveDuplicatesFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(2);
		n.next = new Node(2);
		n.next.next = new Node(2);
		n.next.next.next = new Node(3);
		n.next.next.next.next = new Node(4);
		n.next.next.next.next.next = new Node(4);
		n.next.next.next.next.next.next = new Node(2);
		System.out.println("Old list:");
		RemoveDuplicatesFromLinkedList rm = new RemoveDuplicatesFromLinkedList();
		rm.display(n);
		System.out.println();
		System.out.println(" New List");
		Node newList = rm.removeDuplicate(n);
		rm.display(newList);
	}
	
	public Node removeDuplicate(Node head){
		
		if( head == null )
			return null;
		
		Node prev = head;
		Node current = head.next;
		Node temp;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(head.data, 1);
		while(current != null){	
				
			if(map.containsKey(current.data)){
				prev.next = current.next;
				temp  = current;
				current = current.next;
				temp.next = null;
			}else{
				map.put(current.data,1);
				prev = current;
				current = current.next;
			}
			
		}
		return head;
	}
	
	
	public void display(Node head){
		Node n = head;
		while(n != null){
			System.out.print("->"+n.data);
			n = n.next;
		}
		
	}
	

}

class Node{
	int data;
	Node next;
	
	public Node(int data){
	this.data = data;
	next = null;
	}
	
}
