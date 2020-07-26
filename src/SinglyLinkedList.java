public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;

        }

    }
    public int length()
    {
        int count=0;
        if(head==null)
        {
            return count;
        }

        ListNode current=head;
        while(current!=null)
        {
            count++;
            current=current.next;

        }
        return count;
    }

    public void display()
    {

        ListNode current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;

        }

    }

    public void insertFirst(int value)
    {

        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;

    }

    public static void main(String args[])
    {
        SinglyLinkedList sll=new SinglyLinkedList();;
        sll.insertFirst(10);
        sll.insertFirst(2);
        sll.insertFirst(8);

        sll.display();
        System.out.println("The Length of the LinkedList is : "+sll.length());



    }

}
