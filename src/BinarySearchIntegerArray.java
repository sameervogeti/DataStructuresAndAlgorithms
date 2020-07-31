import java.util.Arrays;

/*
* Program to Implement Binary Search in a sorted Integer Array which will fetch the index of the element queried
* If the Element is not found , return -1
* PS :- Binary Search works only of Sorted Collections
* */
public class BinarySearchIntegerArray {
    int binarySearch(int array[],int number)
    {
        int middle= (int) Math.floor(array.length/2);
        int index;
        if(number>array[middle])
        {
            int rightSide[]= Arrays.copyOfRange(array,middle,array.length);
             index=findElement(rightSide,number);
             if(index==0)
             {
                 return -1;
             }
             return middle+index;
        }
        else if(number<array[middle])
        {
            int leftSide[]=Arrays.copyOfRange(array,0,middle);
            index= findElement(leftSide,number);
            return index;
        }
        else if(number==array[middle])
        {
            return middle;
        }
        else
        {
            return -1;
        }

    }
    int findElement(int[] array,int number)
    {
        for(int index=0;index<array.length;index++)
        {
            if(array[index]==number)
            {
                return index;
            }
        }
       return 0;
    }

    public static void main(String args[])
    {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        BinarySearchIntegerArray binarySearchIntegerArray=new BinarySearchIntegerArray();
        System.out.println(binarySearchIntegerArray.binarySearch(array,10));
    }

}
