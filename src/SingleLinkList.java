public class SingleLinkList {

    private Node head;
    private Node tail;
    private int length;

    public SingleLinkList() {
        head = null;
        tail = null;
        length = 0;
    }

    public int getLength() {
        return this.length;
    }

    void add(Object data) {
        Node node = new Node(data);

        if (head == null) {
            this.head = node;
            this.tail = this.head;
        } else {
            Node heaad = this.head;
            while (heaad.next != null) {
                heaad = heaad.next;
                this.tail = heaad;
            }
            heaad.next = node;
            this.tail = node;

        }
        length++;
        System.out.println(data + " Added to the Linked List");
    }

    Object pop() {
        Object popped = null;
        int lastButOne = 0;
        if (length == 0) {

            System.out.println("Nothing to Pop");
            return -1;
        } else {

            Node current = this.head;
            while (current != null) {
                ++lastButOne;


                if ((length - lastButOne) == 1) {
                    this.tail = current;
                    popped = current.next.data;
                    current.next = null;
                    length--;

                }
                current = current.next;
            }
            return popped;
        }

    }

    Object shiftHead() {
        Node temp = this.head;
        this.head = temp.next;
        length--;
        return temp.data;
    }

    Object unShiftHead(Object Data) {
        Node temp = new Node(Data);
        temp.next = this.head;
        this.head = temp;
        length++;
        return temp.data;
    }
    Node get(int index)
    {
        int counter=0;
        Node head=this.head;
        if(index<0)
        {
            return null;
        }
        else if(index>length)
        {
            return null;
        }
        else
        {
            while (length>0 && head!=null)
            {
                if(index==counter)
                {
                    return head;
                }
                counter++;
                head=head.next;
            }
        }
        return null;
    }
    void set(int index,Object newValue)
    {
        int counter=0;
        Node head=this.head;
        if(index<0)
        {
            System.out.println("Can't query for negative Index");
        }
        else if(index>length)
        {
            System.out.println("No. of Elements Lesser than the index provided");
        }
        else
        {
            while (length>0 && head!=null)
            {
                if(index==counter)
                {
                    head.data=newValue;
                    System.out.println("Value set for Index : "+index);
                }
                counter++;
                head=head.next;
            }
        }

    }

    void insertAt(int index,Object newValue)
    {
        int counter=0;
        Node currentNode=this.head;
        if(index<0)
        {
            System.out.println("Can't query for negative Index");
        }
        else if(index>length)
        {
            System.out.println("No. of Elements Lesser than the index provided");
        }
        else
        {
            while (length>0 && currentNode!=null)
            {
                if(index==counter)
                {
                    Node newNode=new Node(newValue);
                    Node previousNode=get(index-1);
                    previousNode.next=newNode;
                    set(index,newValue);
                    newNode.next=currentNode;
                    //currentNode=newNode;
                    //this.head=currentNode;
                    length++;


                    System.out.println("Value set for Index : "+index);
                }
                counter++;
                currentNode=currentNode.next;
            }
        }

    }

    void remove(int index)
    {
        int counter=0;
        Node currentNode=this.head;
        if(index<0)
        {
            System.out.println("Can't query for negative Index");
        }
        else if(index>length)
        {
            System.out.println("No. of Elements Lesser than the index provided");
        }
        else
        {
            while (length>0 && currentNode!=null)
            {
                if(index==counter)
                {
                    Node previousNode=get(index-1);
                    previousNode.next=currentNode.next;

                    length--;


                    System.out.println("Node Removed At Index : "+index);
                }
                counter++;
                currentNode=currentNode.next;
            }
        }

    }

    Object getHead() {
        if (this.head != null) {
            return this.head.data;
        }
        return "No Data";

    }

    Object getTail() {
        return this.tail.data;
    }

    void printElements() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }
    void reverse()
    {
        System.out.println(tail.data);
        Node previousTail=previousNode(tail);
          while(previousTail!=null)
          {

              System.out.println(previousTail.data);
              previousTail=previousNode(previousTail);

          }

    }

    private Node previousNode(Node currentNode)
    {
        Node traversingNode=this.head;
        int index=0;
        while(traversingNode!=null)
        {
            if(traversingNode.data==currentNode.data)
            {
                if(index==0)
                {
                    return null;
                }
                else
                {
                    return get(index-1);
                }
            }
            else
            {
                index++;
            }
            traversingNode=traversingNode.next;
        }
        return null;
    }

    private class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            next = null;
        }
    }

}

class SingleLinkListTest {
    public static void main(String[] args) {
        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.add(1);
        singleLinkList.add(2);
        singleLinkList.add(3);
        singleLinkList.add(4);
        singleLinkList.add(5);
        Object shiftedData = singleLinkList.shiftHead();


        System.out.println("Shift Head Result is: " + shiftedData);
        System.out.println("unShift Head Result is: " + singleLinkList.unShiftHead(shiftedData));
        System.out.println("Head is: " + singleLinkList.getHead());
        System.out.println("Tail is: " + singleLinkList.getTail());
        singleLinkList.printElements();
        System.out.println("The New Length is: " + singleLinkList.getLength());

        singleLinkList.set(0,78);
        singleLinkList.printElements();
        singleLinkList.insertAt(2,77);
        singleLinkList.insertAt(3,79);
        System.out.println("Updated Length is:"+singleLinkList.getLength());
        singleLinkList.printElements();
        System.out.println("Remove Operation");
        singleLinkList.remove(3);
        System.out.println("Updated Length is:"+singleLinkList.getLength());
        singleLinkList.printElements();
        System.out.println("Reverse");
        singleLinkList.reverse();

    }
}
