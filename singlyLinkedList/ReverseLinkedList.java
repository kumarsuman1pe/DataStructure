package DataStructure.singlyLinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);

		printList(head);

		ListNode ll = head.reverseLinkedList1(head);

		printList(ll);
	}

	public static void printList(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
		System.out.println();
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}

	public ListNode reverseLinkedList1(ListNode head) {

		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		return prev;

	}

	public ListNode reverseLinkedList(ListNode head) {
		ListNode current = head;
		ListNode fwd = head;
		ListNode prev = null;
		while (current != null) {
			// System.out.println(current.val);

			fwd = current.next;// 2
			current.next = prev;// null
			prev = current;// 1
			current = fwd;

		}
		return prev;
	}
}
