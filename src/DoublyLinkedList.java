public class DoublyLinkedList {



    private class Node {

        Object data;
        Node previous;
        Node next;

        Node(Object data)
        {
            this.data=data;
            previous=null;
            next=null;
        }

    }

    DoublyLinkedList()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    private Node tail;
    private Node head;

    public int getLength() {
        return length;
    }

    private int length;

    public void add(Object data)
    {
        Node currentNode=new Node(data);
       if(head==null)
       {
        this.head=currentNode;
        this.tail=this.head;
        currentNode.next=null;
        currentNode.previous=null;
        length++;
        System.out.println("Element Added to the Begining List");
       }
       else
       {
           Node currentHead=this.head;
           while(currentHead.next!=null)
           {
               this.tail=currentHead;
               currentHead=currentHead.next;

           }
           currentHead.next=currentNode;
           currentNode.previous=currentHead;
           this.tail=currentNode;
           length++;
           System.out.println("Element Added to the List");
       }

    }



    public void printElements()
    {
        Node currentHead=this.head;
        while(currentHead!=null)
        {
            System.out.println(currentHead.data);
            currentHead=currentHead.next;
        }
    }
    private Object previousElement(Node currentNode)
    {
        if(currentNode.previous!=null)
        {
            return currentNode.previous.data;
        }
        return null;
    }

    public Object headValue()
    {
        if(head!=null)
        {
            return head.data;
        }
        return null;
    }

    public Object tailValue()
    {
        if(tail!=null)
        {
            return this.tail.data;
        }
        return null;
    }
    public void delete(Object data)
    {
        Node currentNode=this.head;
        while(currentNode!=null)
        {
            if(currentNode.data==data)
            {
                if(currentNode.next!=null && currentNode.previous!=null)
                {
                    this.tail=currentNode.next;
                    currentNode.previous.next=currentNode.next;
                    currentNode.previous=null;
                    currentNode.next=null;
                    length--;
                }
                else if(currentNode.next!=null && currentNode.previous==null)
                {

                    head=currentNode.next;
                    currentNode=null;
                    length--;
                }
                else if(currentNode.next==null && currentNode.previous!=null)
                {
                    tail=currentNode.previous;
                    tail.next=null;
                    length--;
                }
                else
                {
                    System.out.println("Else");
                    currentNode.previous=null;
                    currentNode.next=null;
                    this.tail=null;
                    length--;
                }

                System.out.println("Object Removed from the list");
               // break;

            }
            else
            {
                currentNode=currentNode.next;
            }

        }
    }


}

class DoublyLinkedListTest
{
    public static void main(String args[])
    {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.add(1);
        doublyLinkedList.add(1);
        doublyLinkedList.add(3);

        doublyLinkedList.printElements();
        System.out.println("The Length is : "+doublyLinkedList.getLength());
        doublyLinkedList.printElements();
        //doublyLinkedList.delete(3);
        System.out.println("Tail Value: "+doublyLinkedList.tailValue());
        System.out.println("Head Value: "+doublyLinkedList.headValue());
    }
}
