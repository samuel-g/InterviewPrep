
public class MyStackLL {

	private Node head;

	class Node {
		int data;
		Node next;
	}

	MyStackLL() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void push(int value) {
		Node node = new Node();
		node.data = value;
		node.next = head; // adding on left
		head = node;
	}

	public int peek() {
		return head.data;
	}

	public int pop() throws Exception {
		if (!isEmpty()) {
			int poppedValue = head.data;
			head = head.next;
			return poppedValue;
		} else {
			throw new Exception("Stack Empty!");
		}
	}

	public void printStack() {
		while (head != null) {
			System.out.format("%d \n", head.data);
			head = head.next;
		}
	}

}
