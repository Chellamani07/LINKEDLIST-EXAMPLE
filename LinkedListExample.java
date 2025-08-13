class Node {
    int data;
    Node next;
    Node(int value) {
        data = value;
        next = null;
    }
}

public class LinkedListExample {
    Node head;
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Linked List:");
        list.display();
    }
}
