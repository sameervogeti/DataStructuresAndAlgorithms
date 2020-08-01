public class InsertionSort {

    int[] sort(int[] array)
    {
        for(int i=1;i<array.length;i++)
        {
            int currentVal=array[i];
            int j=i-1;
            for(;j>=0 && array[j]>currentVal ;j--)
            {
                array[j+1]=array[j];
            }
            array[j+1]=currentVal;
        }
        return array;
    }

    public static void main(String args[])
    {
        int array[]={4,2,5,8,1};
        InsertionSort insertionSort=new InsertionSort();
        int[] sortedArray=insertionSort.sort(array);
        for(int number:sortedArray)
        {
            System.out.println(number);
        }
    }
}
