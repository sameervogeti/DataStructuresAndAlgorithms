/*
* Program to perform Bubblesort on an integer array.
* Time Complexity = O(N^2)
* */

public class BubbleSort {

    int[] bubbleSort(int[] array)
    {
        for(int i=array.length-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
    public static void main(String args[])
    {
        BubbleSort bubbleSort=new BubbleSort();
        int[] array={1,9,8,7,6,5,4,3};
        int sortedArray[]=bubbleSort.bubbleSort(array);

        for(Integer number:sortedArray)
        {
            System.out.println(number);
        }
    }
}
