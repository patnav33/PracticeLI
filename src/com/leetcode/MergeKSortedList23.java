package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author navin
 
 Merge k sorted linked lists and  return it as one sorted list. Analyze
  and describe its complexity.


Time Complexity : 
Time: log(k) * n.
k is number of list and n is number of total elements.
 *
 */
public class MergeKSortedList23 {
	
	public ListNode mergeKList(ListNode[] lists){
			
		if( lists == null || lists.length== 0){
			return null;
		}
		
		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
			public int compare(ListNode n1, ListNode n2){
				return n1.value - n2.value;
		}
	});
		
		ListNode head = new ListNode(0);
		ListNode p = head;
		
		for( ListNode list:lists ){
			if( list!=null){
				queue.offer(list);
			}
		}
		
		while( !queue.isEmpty()){
	        ListNode n = queue.poll();
	        p.next = n;
	        p = p.next;
	        
	        if( n.next != null){
	        	queue.offer(n.next);
	        }
		}
		
		return null;

	}
	
	public class ListNode{
		
		int value;
		ListNode next;
		
		public ListNode(int value){
			this.value = value;
			next = null;
		}
		
	}

}



