package linkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	    private Node head;
	    private int length;

	    class Node {
	        int value;
	        Node next;

	        Node(int value) {
	            this.value = value;
	        }
	    }

	    public RemoveDuplicates(int value) {
	        Node newNode = new Node(value);
	        head = newNode;
	        length = 1;
	    }

	    public Node getHead() {
	        return head;
	    }

	    public int getLength() {
	        return length;
	    }

	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.println(temp.value);
	            temp = temp.next;
	        }
	    }

	    public void printAll() {
	        if (length == 0) {
	            System.out.println("Head: null");
	        } else {
	            System.out.println("Head: " + head.value);
	        }
	        System.out.println("Length:" + length);
	        System.out.println("\nLinked List:");
	        if (length == 0) {
	            System.out.println("empty");
	        } else {
	            printList();
	        }
	    }
	    
	    public void makeEmpty() {
	        head = null;
	        length = 0;
	    }
	    
	    public void append(int value) {
	        Node newNode = new Node(value);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	        length++;
	    }
	    
	    public void removeDuplicates() {
	        if (head == null) {
	            return;
	        }

	        Set<Integer> seen = new HashSet<>();
	        Node current = head;
	        Node prev = null;

	        while (current != null) {
	            if (seen.contains(current.value)) {
	                prev.next = current.next;
	                length--;
	            } else {
	                seen.add(current.value);
	                prev = current;
	            }
	            current = current.next;
	        }
	    }
	}

