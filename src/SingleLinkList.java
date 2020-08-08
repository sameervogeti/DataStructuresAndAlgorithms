public class SingleLinkList {

    private Node head;
    private Node tail;

    public int getLength() {
        return this.length;
    }

    private int length;
    private class Node
    {
        Object data;
        Node next;
        Node(Object data)
        {
            this.data=data;
            next=null;
        }
    }

    void add(Object data)
    {
        Node node=new Node(data);

       if(head==null)
       {
           this.head=node;
           this.tail=this.head;
        }
       else
       {
           Node heaad=this.head;
           while(heaad.next!=null)
           {
               heaad=heaad.next;
               this.tail=heaad;
           }
           heaad.next=node;
           this.tail=node;

        }
        length++;
       System.out.println(data+" Added to the Linked List");
    }
    Object pop()
    {
        Object popped=null;
        int lastButOne=0;
        if(length==0)
        {

            System.out.println("Nothing to Pop");
            return -1;
        }
       else
        {

            Node current=this.head;
            while(current!=null)
            {
                ++lastButOne;


                if((length-lastButOne)==1)
                {
                    this.tail=current;
                    popped=current.next.data;
                    current.next=null;
                    length--;

                }
                current=current.next;
            }
           return popped;
        }

    }
    Object shiftHead()
    {
        Node temp=this.head;
        this.head=temp.next;
        length--;
        return temp.data;
    }
    Object unShiftHead(Object Data)
    {
        Node temp=new Node(Data);
        temp.next=this.head;
        this.head=temp;
        length++;
        return temp.data;
    }
    Object getHead()
    {
        if(this.head!=null)
        {
            return this.head.data;
        }
        return "No Data";

    }
    Object getTail()
    {
        return this.tail.data;
    }
    void printElements()
    {
        Node current=this.head;
        while (current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }

    }
    public SingleLinkList()
    {
        head=null;
        tail=null;
        length=0;
    }

}
class SingleLinkListTest
{
    public static void main(String args[])
    {
        SingleLinkList singleLinkList=new SingleLinkList();
        singleLinkList.add(1);
        singleLinkList.add(2);
        singleLinkList.add(3);
        singleLinkList.add(4);
        singleLinkList.add(5);
        Object shiftedData=singleLinkList.shiftHead();


        System.out.println("Shift Head Result is: "+shiftedData);
        System.out.println("unShift Head Result is: "+singleLinkList.unShiftHead(shiftedData));
      //  System.out.println("Shift Head Result is: "+singleLinkList.shiftHead());
      //  System.out.println("Shift Head Result is: "+singleLinkList.shiftHead());
      //  System.out.println("Shift Head Result is: "+singleLinkList.shiftHead());
        System.out.println("Head is: "+singleLinkList.getHead());
        System.out.println("Tail is: "+singleLinkList.getTail());
        singleLinkList.printElements();
        System.out.println("The New Length is: "+singleLinkList.getLength());
        

    }
}
