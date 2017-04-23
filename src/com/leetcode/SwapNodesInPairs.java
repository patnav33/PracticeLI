package com.leetcode;

public class SwapNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		
		ListNode temp = swapPairs(head);
		while(temp!=null){
			System.out.print(" " + temp.data);
			temp = temp.next;
		}
	}


	    public static ListNode swapPairs(ListNode head){
	        
	        ListNode pre = new ListNode(0);
	        pre.next = head;
	        ListNode previous = pre;
	        while( previous.next != null && previous.next.next != null){
	            
	            ListNode current = previous.next;
	            ListNode nextNode = previous.next.next;
	            current.next = nextNode.next;
	            nextNode.next = current;
	            previous.next= nextNode;
	            previous = current;
	         
	        }
	       return pre.next;
	    }

}
	
class ListNode{
    
    int data;
    ListNode next;
    
    public ListNode(int data){
    this.data = data;
    }
    
}
