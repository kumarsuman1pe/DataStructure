package DataStructure.doublyLinked;

/***
 * 
 * @author sumankumar
 * 
 *         Implementation of Doubly linkedlist
 * 
 */
public class DoublyLinkedList {
	Node head;

	public DoublyLinkedList() {

	}

	public void insert(int data) {
		if (head == null) {
			Node newNode = new Node();
			newNode.setPrev(null);
			newNode.setData(data);
			newNode.setNext(null);
			head = newNode;
		} else {
			Node cur = head;
			while (cur.getNext() != null) {
				cur = cur.getNext();
			}

			Node newNode = new Node();
			newNode.setData(data);
			newNode.setPrev(cur);
			cur.setNext(newNode);
			newNode.setNext(null);

		}
	}

	/*
	 * 2. Display
	 */
	public void display() {
		if (head != null) {
			Node current = head;
			while (current != null) {
				System.out.println(current.getData());
				current = current.getNext();
			}
		} else {
			System.out.print("LinkedList is empty...");
		}
	}
}
