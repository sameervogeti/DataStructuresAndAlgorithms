/*
 * Write a Program which will accept a Sorted Array of Integers. The function should
 * find the First pair where the sum of Numbers is zero. If No Such pair is found,
 * Print a message, No Such Elements Formed.
 *
 * Example :- [-3,-2,-1,0,1,2,3]
 * Output :- [-3,3]
 * Example :- [-3,-2,1]
 * Output :- No such Elements
 * */

import java.util.*;

public class SumZero {
    public static void main(String[] args) {
        SumZero sumZero = new SumZero();
        int[] array = {-3, -2, -1, 0, 1, 2, 3};
        int[] sumZeroArray = sumZero.sumZeroPair(array);
        if (sumZeroArray.length != 0) {
            System.out.println(sumZeroArray[0] + "," + sumZeroArray[1]);

        } else {
            System.out.println("No Such Pair Found in the Given Array");

        }
    }

    int[] sumZeroPair(int[] mainArray) {

        List<Integer> convertedList = new ArrayList(Collections.singleton(mainArray));
        int[] zeroFormingPair = {};
        Map<Integer, Integer> valueMap = copyValuesToMap(mainArray);

        for (int number : mainArray) {
            int numberToFind = 0 - number;
            if (valueMap.containsKey(numberToFind)) {
                zeroFormingPair = new int[]{number, numberToFind};
                return zeroFormingPair;
            }

        }
        return zeroFormingPair;
    }

    Map<Integer, Integer> copyValuesToMap(int[] mainArray) {
        Map<Integer, Integer> valueMap = new HashMap<>();
        int counter = 1;
        for (int number : mainArray) {
            if (valueMap.containsKey(number)) {
                valueMap.put(number, valueMap.get(number) + 1);
            }
            valueMap.put(number, counter);
        }
        return valueMap;
    }
}
