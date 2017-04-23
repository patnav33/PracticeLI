package com.practice;

/**
 * @author navin
 
 Given a linked list and inte­ger ‘n’, write an algo­rithm to
  find the nth node from the end in the Linked List.

Exam­ple:

Original List : ->1->2->8->3->7->0->4
Output : 3rd Element from the end is : 7
Input: An unsorted linked list and inte­ger k

Out­put: The kth to Last Ele­ment of a Singly Linked List

Approach:

Recur­sive Approach:

Recurse through the Linked list
When we reach to the end of the list, base case will return 0
Now with each pass­ing back call through stack, add 1 and return.
When count hits k, print the value.

Iter­a­tive Approach:

Take two point­ers approach
Move first pointer by k
now move both the point­ers and when the first pointer reaches 
the end of the list the sec­ond pointer will be at the kth node from the end.
Return the kth node data.
  
  
 *
 */
public class NthNodeFromEndOfLinkedList {

	public static void main(String[] args) {
		Node n = new Node(1);
		n.next = new Node(2);
		n.next.next = new Node(8);
		n.next.next.next = new Node(3);
		n.next.next.next.next = new Node(7);
		n.next.next.next.next.next = new Node(0);
		n.next.next.next.next.next.next = new Node(4);
		System.out.print("Original List : ");
		NthNodeFromEndOfLinkedList rm = new NthNodeFromEndOfLinkedList();
		rm.display(n);		
		System.out.print("\n Recursion::3rd Element from the end is : ");
		rm.kthByRecursion(n, 3);
		System.out.print("\n Iteration::5th Element from the end is : " + rm.kthByIteration(n, 5));	

	}
	
	public void display(Node head){
		
		Node n = head;
		while(n!= null){
			System.out.print("->t;" + n.data);
			n= n.next;
		}
	}
		
	//Recursive way
	
	public int kthByRecursion(Node head,int k){
		
		if(head == null)
			return 0;
		
		int i = kthByRecursion(head.next,k) + 1;
		if( i == k){
			System.out.println(head.data);
		}
		return i;
		
	}
	
	// Iterative way
	public int kthByIteration(Node head, int k){
		
		if( head == null)
			return 0;
		
		Node curr = head;
		while(k > 0){
			curr = curr.next;
			k--;
		}
		Node sec = head;
		while(curr!= null){
			
			curr= curr.next;
			sec = sec.next;
			
		}
		
		int i = sec.data;
		return i;
		
	}
}
