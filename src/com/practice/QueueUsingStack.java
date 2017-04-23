package com.practice;

import java.util.Stack;

//Using one Stack
//class QueueUsingSingleStack{
//	 Stack<Integer> stack = new Stack<Integer>();
//	 
//	 public void enQueue(int data){
//	  stack.add(data);
//	 }
//	 
//	 public void deQueue(){
//	  if(stack.size()<1){
//	   System.out.println("Nothing to deQueue");
//	   return;
//	  }
//	 
//	  if(stack.size()==1){
//	   System.out.println(stack.pop());
//	   return;
//	  }
//	 
//	  int data = stack.pop();
//	  deQueue();
//	  stack.push(data);
//	 }
//	}


public class QueueUsingStack {

	Stack<Integer> temp = new Stack<Integer>();
	Stack<Integer> value = new Stack<Integer>();

	// Push element x to the back of queue.
	public void push(int x) {
		if (value.isEmpty()) {
			value.push(x);
		} else {

			while (!value.isEmpty()) {
				temp.push(value.pop());
			}
			
			value.push(x);

			while (!temp.isEmpty()) {
				value.push(temp.pop());
			}
		}
	}

	public void pop() {
		value.pop();
	}

	public int peek() {
		return value.peek();
	}

	public boolean empty() {
		return value.isEmpty();
	}
}

