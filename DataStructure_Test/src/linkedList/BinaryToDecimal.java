package linkedList;

public class BinaryToDecimal {

	private Node head;
	private int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public BinaryToDecimal(int value) {
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
		if (temp == null) {
			System.out.println("empty");
		} else {
			while (temp != null) {
				System.out.print(temp.value);
				temp = temp.next;
				if (temp != null) {
					System.out.print(" -> ");
				}
			}
			System.out.println();
		}
	}

	public void makeEmpty() {
		head = null;
		length = 0;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
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

	public int binaryToDecimal() {
		if(head == null) {
			return 0;
		}
		int num = 0;
		Node temp = head;

		while (temp != null) {
			num = (num * 2) + temp.value;
			temp = temp.next;
		}
		return num;
	}
}
