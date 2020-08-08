class LinkedList {
    static Node head;

    public static void main(String[] args) {
        LinkedList list;
        list = new LinkedList();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        list.printLinkedList(head);
        head = list.reverseLinkedList(head);
        list.printLinkedList(head);
    }

    Node reverseLinkedList(Node node) {
        Node previous = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        node = previous;
        return previous;
    }

    void printLinkedList(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

}