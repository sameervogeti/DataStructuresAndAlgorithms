/*Write a Java program to Count the Frequency of Numbers in an Integer Array
 * */

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        HashMap<Integer, Integer> countTable = new HashMap<>();
        int[] array = {1, 1, 2, 3, 4, 4, 5, 5, 5, 6};
        int count = 1;
        for (int index = 0; index < array.length; index++) {
            if (countTable.containsKey(array[index])) {
                countTable.put(array[index], countTable.get(array[index]) + 1);
            } else {
                countTable.put(array[index], count);
            }
        }
        // Printing the freqMap
        for (Map.Entry entry : countTable.entrySet()) {
            System.out.println("Number " + entry.getKey() + " Occurs  " + entry.getValue() + " Times");
        }
    }
}
