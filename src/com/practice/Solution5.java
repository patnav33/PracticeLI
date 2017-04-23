package com.practice;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		list.next.next.next = new ListNode(4);
		list.next.next.next.next = new ListNode(5);
		list.next.next.next.next.next = new ListNode(6);
		
		ListNode list2 = new ListNode(90);
		list2.next = new ListNode(98);
		list2.next.next = new ListNode(91);
		list2.next.next.next = new ListNode(3);
		list2.next.next.next.next = new ListNode(4);
		list2.next.next.next.next.next = new ListNode(5);
		list2.next.next.next.next.next.next = new ListNode(6);
			
		int result= getIntersectionNode(list,list2);
//		System.out.println(result.val);
	}

public static int findCorruptedIndex(Node a, Node b) {
        int len1 = 0;
        int len2 = 0;
        int previous= 0;
        Node headA = a;
        Node headB = b;
        if (a == null || b == null)
            return -1;
 
        while(a != null){
            len1++;
            a = a.next;
        }
        while(b !=null){
            len2++;
            b = b.next;
        }
 
        int diff = 0;
        a=headA;
        b=headB;
 
        if(len1 > len2){
            diff = len1-len2;
            int i=0;
            while(i<diff){
                a = a.next;
                i++;
            }
        }else{
            diff = len2-len1;
            int i=0;
            while(i<diff){
                b = b.next;
                i++;
            }
        }
 
        while(a != null && b != null){
            if(a.val == b.val){
            	return previous;
            }
            a = a.next;
            previous++;
            b = b.next;
        }
        previous = 0;
        if( previous == 0){
    		return -1;
    	}
 
        return -1;
    }
}

 class Node{
	int val;
	Node next;
	
	public Node(int val){
		this.val = val;
	}
	
}
