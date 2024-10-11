package DataStructure.Interview;

public class SGAnalytics {
    public static void main(String[] args) {
        LinkedList head= new LinkedList(1);
        head.next=new LinkedList(2);
        head.next.next = new LinkedList(4);
        
        printLinkedList(head);
        LinkedList newHead = reverserLinkedList(head);
        
        printLinkedList(newHead);
    }

    private static void printLinkedList(LinkedList newHead) {
        LinkedList temp = newHead;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();
    }

    private static LinkedList reverserLinkedList(LinkedList head) {
        
        LinkedList current = head;
        LinkedList prev = null;
        LinkedList next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

class LinkedList {
    public int data;
    public LinkedList next;

    public LinkedList() {
    }

    public LinkedList(int data)
    {
        this.data = data;
    
    }
}