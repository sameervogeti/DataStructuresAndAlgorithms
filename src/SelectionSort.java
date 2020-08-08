public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {7, 4, 1, 2, 1, 6, 10, 9};
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArray = selectionSort.sort(array);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    int[] sort(int[] array) {
        int lowest;
        for (int i = 0; i < array.length; i++) {
            lowest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[lowest]) {
                    lowest = j;
                }

            }
            int temp = array[i];
            array[i] = array[lowest];
            array[lowest] = temp;
        }
        return array;
    }
}
