package com.practice;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list = new Node(1);
		list.next = new Node(2);
		list.next.next = new Node(3);
		list.next.next.next = new Node(4);
		list.next.next.next.next = new Node(5);
		list.next.next.next.next.next = new Node(6);
		System.out.println(list.toString());
		System.out.println("For Stack Middle value:");
		System.out.println(findMiddleElement(list));
		System.out.println("Print in Reverse ");
		printreverse(list);
		System.out.println();
		 System.out.println((reverseListRecursive(list)).toString());
		// System.out.println((reverseListIterative(list)).toString());
	

	}
	
	public static int findMiddleElement(Node list) {
		if (list == null || list.next == null) {

		}
		Node slow = list;
		Node fast = list;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public static int detectCycle(Node head) {

		if (head == null || head.next == null)
			return -1;

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null)
			slow = slow.next;
		fast = fast.next.next;

		if (slow == fast) {
			System.out.println("Cycle Found");
			return 1;
		}

		return -1;
	}

	public static Node reverseListRecursive(Node head) {

		if (head == null || head.next == null) {

			return head;
		}

		Node remainingList = reverseListRecursive(head.next);

		head.next.next = head;

		head.next = null;

		return remainingList;

	}

	// Print only the Reverse String not Reverse the list

	public static void printreverse(Node head) {

		if (head == null || head.next == null) {

			return;
		}

		printreverse(head.next);

		System.out.println(head.data);

	}

	public static Node reverseListIterative(Node head) {

		if (head == null || head.next == null)
			return head;

		Node current = head;
		Node previous = null;
		Node nextNode;
		while (current != null) {

			nextNode = current.next;
			current.next = previous;

			previous = current;
			current = nextNode;

		}

		return previous;
	}

}

class Node {

	int data;
	Node next;

	public Node(int data) {

		this.data = data;
		next = null;
	}

	public String toString() {
		Node curr = this;
		String output = "";
		while (curr != null) {
			output += curr.data + "-->";
			curr = curr.next;
		}
		return output += "null";
	}

}
