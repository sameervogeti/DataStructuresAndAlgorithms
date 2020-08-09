public class StackUsingArray {
    private Object[] stackArray;
    private int limit;
    private int index;
    StackUsingArray()
    {
        this.index=0;
        this.limit=100;
        this.stackArray=new Object[limit];
    }
    public void push(Object dataToBePushed)
    {
        if(index>limit)
        {
            System.out.println("Error: StackOverflow");
        }
        else
        {
            stackArray[index]=dataToBePushed;
            index++;
        }




    }

    public void pop()
    {

        if(index>0)
        {

            System.out.println(stackArray[index-1]+" has been popped");
            --index;
        }
        else
        {
            System.out.println("No Elements  to be Popped");
        }


    }

    public void printStack()
    {
        for(int i=0;i<=index-1;i++)
        {
           System.out.println(stackArray[i]);

        }

    }
    public int length()
    {
        return this.index;
    }
}
 class StackTest
{
    public static void main(String args[])
    {
        StackUsingArray stackUsingArray=new StackUsingArray();
        stackUsingArray.push("Hi");
        stackUsingArray.push("There");
        stackUsingArray.push("How");
        stackUsingArray.push("are");
        stackUsingArray.push("you");
        stackUsingArray.push("you");
        stackUsingArray.push("you");
        stackUsingArray.push("you");
        stackUsingArray.push("you");
        stackUsingArray.push("you");
        stackUsingArray.push("you");
        stackUsingArray.push("you");
        System.out.println("Before Popping, Length = "+stackUsingArray.length());
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.printStack();
        System.out.println("After Popping, Length = "+stackUsingArray.length());

    }
}
