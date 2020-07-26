/*
Write a Program to Compare Two arrays
and check if the square of each number in First Array is present in the second array.
PS:- For Simplicity ,Second Array Should Only Contain the Squares of the Numbers in the First Array
Example:- Array 1:- [1,2,3,4], Array 2:-[4,1,16,9]

* */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class NumberSquareCompared {
    public static void main(String args[])
    {
        NumberSquareCompared object=new NumberSquareCompared();

        int array1[]={1,2,3,4,5,7,9};
        int array2[]= {16,4,1,9};

        System.out.println("Are Squares of First Array present in the Second Array: "+object.ifSquaresArePresent(array1,array2));

    }
    boolean ifSquaresArePresent(int array1[],int array2[])
    {
        boolean areEqual=false;
        int count=1;
        HashMap<Integer,Integer> countTable=new HashMap<>();
        HashMap<Integer,Integer> countTable1=new HashMap<>();

            for(int index=0;index<array1.length;index++)
            {
                if(countTable.containsKey(array1[index]))
                {
                    countTable.put(array1[index]*array1[index],countTable.get(array1[index])+1);
                }
                else
                {
                    countTable.put(array1[index]*array1[index],count);
                }
            }

            for(int index=0;index<array2.length;index++)
            {
                if(countTable1.containsKey(array2[index]))
                {
                    countTable1.put(array2[index],countTable1.get(array2[index])+1);
                }
                else
                {
                    countTable1.put(array2[index],count);
                }
            }
            System.out.println("First array elements:");
            for(Integer number:countTable.keySet())
            {
                System.out.println(number);
            }
            System.out.println("Second array elements:");
            for(Integer number:countTable1.keySet())
            {
                System.out.println(number);
            }

            List<Integer> list1=new ArrayList<Integer>(countTable.keySet());
            List<Integer> list2=new ArrayList<Integer>(countTable1.keySet());

            if(list1.containsAll(list2))
            {
                areEqual=true;
                return areEqual;
            }

            return areEqual;

    }
}
