/*
* Program to perform Bubblesort on an integer array.
* Time Complexity = O(N^2)
* */

public class BubbleSort {

    int[] bubbleSort(int[] array)
    {
        boolean noSwaps;
        for(int i=array.length-1;i>=0;i--)
        {
            noSwaps=true;
            for(int j=0;j<=i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    noSwaps=false;
                }
            }
            if(noSwaps)
            {
                break;
            }
        }
        return array;
    }
    public static void main(String args[])
    {
        BubbleSort bubbleSort=new BubbleSort();
        int[] array={1,3,5,7,9,11,13,19,15,17};
        int sortedArray[]=bubbleSort.bubbleSort(array);

        for(Integer number:sortedArray)
        {
            System.out.println(number);
        }
    }
}
