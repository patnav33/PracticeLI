package com.practice;

import java.util.Stack;

/**
 * @author navin
 
Given two numbers which are represented using 
linked lists as shown below. Your program should 
return the reference to a new linked list which stores 
the sum of given two numbers. 

Numbers are represented as following:
Number 99971, corresponding linked list: 9->9->9->7->1
Number 998,   corresponding linked list: 9->9->8
  
Time Complexity is O(n)
Space Complexity is O(n)  
 *
 */
public class SumTwoLinkedListUsingStack {

	public static ListNode head;
	public static ListNode tail;
	
	public static void main(String[] args) {
		
		SumTwoLinkedListUsingStack solution = new SumTwoLinkedListUsingStack();
		int[] first = {9,9,9,7,1};
		int[] second = {9,9,8};
		ListNode head1 = solution.createLL(first);
		ListNode head2 = solution.createLL(second);
		
		ListNode result = solution.addList(head1,head2);
		
	}


private  ListNode createLinkedList(Stack<Integer> s){
	
	if(head != null){
		head = null;
	}
	while( !s.isEmpty()){
		append(s.pop());
	}
	return head;
	
}
private  ListNode addList(ListNode node1,ListNode node2){
	
	if( node1 == null)
		return  node2;
	
	if( node2 == null)
		return node1;
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	Stack<Integer> stack3 = new Stack<Integer>();
	
	// Logic for inserting elements in stack1
	ListNode temp = node1;
	while(temp != null){
		stack.push( temp.data);
		temp = temp.next;
	}
	
	// Logic for inserting elements in stack2
	ListNode temp2 = node2;
	while(temp2 != null){
			stack2.push( temp2.data);
			temp2 = temp2.next;
	}
	
	int value1 = 0,value2 = 0,carry =0,sum =0;
	while((!stack.isEmpty()) && (!stack2.isEmpty())){
		
		value1 = stack.pop();
		value2 = stack2.pop();
		
		sum = (carry + value1 +value2) % 10;
		carry = (carry + value1 + value2) /10;
		
		stack3.push(sum);
	}
	
	//if Stack still has some values left
	while( !stack.isEmpty()){
		
		value1 = stack.pop();
		
		sum =( value1 + carry ) %10;
		carry = ( value1 + carry ) /10;
		
		stack3.push(sum);
	}
	
	while( !stack2.isEmpty()){
		
		value2 = stack2.pop();
		
		sum =( value2 + carry ) %10;
		carry = ( value2 + carry ) /10;
		
		stack3.push(sum);
	}
	
	
	if( carry > 0){
		stack3.push(carry);
	}
	
	return 	createLinkedList(stack3);
}
private  ListNode createLL(int[] number ) {
	
	if( head != null){
		return head;
	}
	
	for(int i =0;i < number.length; i++){
		append(number[i]);
	}
	return head;
}

private  void append(int data){
		
	if( head == null){
		head = new ListNode (data);
		tail = head;
		return;
	}
	
	ListNode n = new ListNode(data);
	tail.next = n;
	tail = n;
}

class ListNode{
	
	int data;
	ListNode next;
	
	public ListNode(int data){
		this.data = data;
	}
	
}
}