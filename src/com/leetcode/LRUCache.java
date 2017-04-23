package com.leetcode;

import java.util.HashMap;

public class LRUCache {
	
	static int capacity ;
	static HashMap <Integer,Node> map = new HashMap<>();
	static Node head = null;
	static Node tail = null;
	static int len;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
	}
	
	public LRUCache(int capacity){
		this.capacity = capacity;
		len = 0;
	}
	
	public static int get(int key){
		if( map.containsKey(key)){
			Node n = map.get(key);
			removeNode(n);
			insertHead(n);
			return n.value;
		}
		return -1;	
	}
	
	public static void removeNode(Node node){
		Node currNode = node;
		Node preNode = node.previous;
		Node nextNode = node.next;
		if( preNode == null){
			head = head.next;
			if(head == null){
				tail = head;
			}else{
				head.previous = null;
			}
		}
		if(nextNode == null){
			tail = tail.previous;
			if( tail == null){
				head = tail;
			}else{
				tail.next = null;
			}
		}else{
			preNode.next = nextNode;
			nextNode.previous = preNode;
		}
			
	}
	
	public static void set(int key,int value){
		
		if( map.containsKey(key)){
			Node temp = map.get(key);
			temp.value = value;
			removeNode(temp);
			insertHead(temp);
			map.put(key, temp);
		}
		else{
			Node temp = new Node(key,value);
			if(len < capacity){
				insertHead(temp);
				map.put(key, temp);
				len++;
			}if(len == capacity){
				map.remove(tail.key);
				removeTail();
				insertHead(temp);
				map.put(key, temp);
			}
		}
	}
	
	private static void insertHead(Node temp){
		if(head == null){
			head = temp;
			tail = head;
			head.previous = null;
			temp.next = null;
		}else{
			temp.next = head;
			head.previous = temp;
			head = temp;
			head.previous = null;
			
		}
	}
	
	private static void removeTail(){
		tail = tail.previous;
		if(tail == null){
			head = tail;
		}
		else{
			tail.next = null;
		}
	}
	

}
class Node{
	
	int key;
	int value;
	Node previous;
	Node next;
	
	public Node(int key,int value){
		this.key= key;
		this.value = value;		
	}
	
}