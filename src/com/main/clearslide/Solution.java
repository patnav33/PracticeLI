package com.main.clearslide;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author navinkumarpatil
 * 
 * 
 * Write a class called MinStack that is a stack of integers. It should have all the functions of a stack (push, pop, and peek) and another called min.
 *  Calling min will return the smallest element within the stack at any given moment.
 *
 */
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        MinStacK minStack = new MinStacK();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        minStack.push(4);
        minStack.pop();
        System.out.println("Min:"+minStack.getMin());
        minStack.pop();
        System.out.println("Peek:"+minStack.peek());
        minStack.push(0);
        System.out.println("Min:"+minStack.getMin());
        minStack.pop();
        System.out.println("Min:"+minStack.getMin());
        
        
    }
    
    
    // Stack structure 
    public static class Node {
        
        int data;
        int min;
        Node next;
        
        Node(int data){
            this.data = data;
            next = null;
            min = data;
            
        }
    }
    
    public static class MinStacK{
        
        Node head;
        
    public void push(int input){
        
        if( head== null)
            head = new Node(input);
        else{
            Node temp = new Node(input);
            temp.min = Math.min(head.min,input);
            temp.next = head;
            head = temp;
        }
        
    }
    
    public void pop(){
        if(head == null)
            return;
        head = head.next;
         
    }
    
    public int peek(){
        
        if(head == null)
            throw new IllegalArgumentException("Stack is Empty");
            
        return head.data;
    }
    
    public int getMin(){
        if(head == null)
             throw new IllegalArgumentException("Stack is Empty");
            
        return head.min;
        
    }
    
    }
}