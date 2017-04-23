package com.practice;

/**
 * http://www.geeksforgeeks.org/design-a-stack-with-find-middle-operation/ 
 * Test cases: 
 * Delete middle with 1,2,3 element 
 * Pop with 1,2,3 elements 
 * Delete or pop when empty stack 
 */ 
public class StackWithLinkListMiddleOperation { 
     
    private Node head = null; 
    private Node middle = null; 
    private int size = 0; 
    
    
    public void push(int data){ 
        if(head == null){ 
            head = Node.newNode(data); 
            middle = head; 
            size++; 
            return; 
        } 
        size++; 
        Node node = Node.newNode(data); 
        node.previous = head; 
        head.next = node; 
        head = node; 
        if(size % 2 ==0){ 
            middle = middle.next; 
        } 
    } 
     
    public int size(){ 
        return size; 
    } 
     
    public int pop(){ 
        if(size == 0){ 
            throw new IllegalArgumentException(); 
        } 
        size--; 
        if(size % 2 !=  0 || size == 0){ 
            middle = middle.previous; 
        } 
        int data = head.data; 
        head = head.previous; 
        head.next = null; 
        return data; 
    } 
    
    public int top(){ 
        if(size == 0){ 
            throw new IllegalArgumentException(); 
        } 
        return head.data; 
    } 
    
    public int middle(){ 
        if(size == 0){ 
            throw new IllegalArgumentException(); 
        } 
        return middle.data; 
    } 
    
    public int deleteMiddle(){ 
        if(size == 0){ 
            throw new IllegalArgumentException(); 
        } 
        size--; 
        if(middle == head){ 
            int data = middle.data; 
            middle = middle.previous; 
            head = head.previous; 
            if(head != null){ 
                head.next = null; 
            } 
            return data; 
        } 
         
        if(size % 2 == 0){ 
            int data = middle.data; 
            Node previous = middle.previous; 
            middle = middle.next; 
            middle.previous = previous; 
            if(previous != null){ 
                previous.next = middle; 
            } 
            return data; 
        } 
        else{ 
            int data = middle.data; 
            Node next = middle.next; 
            middle = middle.previous; 
            middle.next = next; 
            if(next != null){ 
                next.previous = middle; 
            } 
            return data; 
        } 
    } 
     
    public static void main(String args[]){ 
        StackWithLinkListMiddleOperation swl = new StackWithLinkListMiddleOperation(); 
        swl.push(1); 
        System.out.println(swl.top() + "middle: " + swl.middle()); 
        swl.push(2); 
        System.out.println(swl.top() + " " + swl.middle()); 
        swl.push(3); 
        System.out.println(swl.top() + " " + swl.middle()); 
        swl.push(4); 
        System.out.println(swl.top() + " " + swl.middle()); 
        swl.push(5); 
        System.out.println(swl.top() + " " + swl.middle()); 
        swl.push(6); 
        System.out.println(swl.top() + " " + swl.middle()); 
        System.out.println("\n\n"); 
        swl.pop(); 
        System.out.println(swl.top() + "Last Middle: " + swl.middle()); 
        swl.deleteMiddle(); 
        System.out.println(swl.top() + "Middle: " + swl.middle()); 
//        swl.pop(); 
//        System.out.println(swl.top() + " " + swl.middle()); 
//        swl.deleteMiddle(); 
//        System.out.println(swl.top() + " " + swl.middle()); 
//        swl.pop(); 
//        System.out.println(swl.top() + " " + swl.middle()); 
//        swl.deleteMiddle(); 
    } 
    
    static class Node{ 
        
    	Node previous; 
    	int data; 
        Node next; 
        
        
         
        public static Node newNode(int data){ 
            Node n = new Node(); 
            n.data = data; 
            n.previous = null; 
            n.next = null; 
            
            return n; 
        } 
        
        
    } 
     
}

