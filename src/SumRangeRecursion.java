/*
 * Program to Add the numbers in a given range recursively.
 * Example :- sumRange(5) should return 5+4+3+2+1=15
 * */

public class SumRangeRecursion {
    public static void main(String[] args) {
        SumRangeRecursion sumRangeRecursion = new SumRangeRecursion();
        System.out.println(sumRangeRecursion.sumRange(2));

    }

    int sumRange(int range) {
        if (range == 1) {
            return 1;
        }
        return range + sumRange(range - 1);
    }
}
