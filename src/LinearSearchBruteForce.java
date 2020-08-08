/*
 * Program to find the first position of a given integer in a sorted integer array using linear search.
 * If number isn't found, return -1
 * This is not a good approach as time complexity is O(N)
 * */

public class LinearSearchBruteForce {

    public static void main(String[] args) {
        LinearSearchBruteForce linearSearchBruteForce = new LinearSearchBruteForce();
        int[] array = {1, 3, 5, 4, 2, 8};
        int number = 8;
        System.out.println("The Position of the number is: " + linearSearchBruteForce.position(number, array));
    }

    int position(int number, int[] numbers) {
        for (int index = 0; index <= numbers.length; index++) {
            if (number == numbers[index]) {
                return index + 1;
            }
        }
        return -1;
    }
}
