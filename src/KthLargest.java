import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest();
        int[] array = {1, 2, 4, 6, 3};
        System.out.println(kthLargest.findKthLargestEnvironment(array, 1));
    }

    int findKthLargestEnvironment(int[] array, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int number : array) {
            minHeap.add(number);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
}
