/*
Program to Left Rotate an array. Or Rotate an Array of N elements by K places
Input :- [1,2,3,4,5,6,7]
Output :- [4,5,6,7,1,2,3]
* */

public class RotateArray {
    private void rotateArray(int array[],int rotateBy)
    {
        for(int index=0;index<rotateBy;index++)
        {
            rotateArraybyOne(array,array.length);
        }
    }

    private void rotateArraybyOne(int array[],int length)
    {
    int index;
    int tempArray;
    tempArray=array[0];
    for(index=0;index<length-1;index++)
    {
        array[index]=array[index+1];
    }
    array[index]=tempArray;
    }

    public static void main(String args[])
    {
        RotateArray rotateArray=new RotateArray();
        int array[]={1,2,3,4,5,6,7};
        rotateArray.rotateArray(array,4);
        for(int i=0;i<=array.length-1;i++)
        {
            System.out.println(array[i]);
        }
    }
}
