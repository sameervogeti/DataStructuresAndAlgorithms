/*
 * Program which will print Last Fibonacci Number of a Specified Range
 * */
public class FibbonaciUsingRecursion {

    public static void main(String[] args) {
        FibbonaciUsingRecursion fibbonaciUsingRecursion = new FibbonaciUsingRecursion();
        System.out.println(fibbonaciUsingRecursion.fibbonaci(10));
    }

    long fibbonaci(int range) {
        if (range <= 2) return 1;
        return fibbonaci(range - 1) + fibbonaci(range - 2);
    }
}
