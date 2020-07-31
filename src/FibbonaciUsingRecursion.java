/*
* Program which will print Last Fibonacci Number of a Specified Range
* */
public class FibbonaciUsingRecursion {

    long fibbonaci(int range)
    {
        if (range <= 2) return 1;
        return fibbonaci(range-1) + fibbonaci(range-2);
    }
    public static void main(String args[])
    {
        FibbonaciUsingRecursion fibbonaciUsingRecursion=new FibbonaciUsingRecursion();
        System.out.println(fibbonaciUsingRecursion.fibbonaci(10));
    }
}
