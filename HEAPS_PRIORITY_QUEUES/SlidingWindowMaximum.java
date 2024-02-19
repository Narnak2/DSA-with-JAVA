package HEAPS_PRIORITY_QUEUES;

import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int results[] = new int[arr.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // Process the first window
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }
        results[0] = pq.peek().val;

        // Process the remaining windows
        for (int i = k; i < arr.length; i++) {
            // Remove elements that are outside the current window
            while (pq.size()>0&&pq.peek().idx <=( i - k)) {
               pq.remove();
            }

            // Add the current element to the max heap
            pq.add(new Pair(arr[i], i));

            // Store the maximum element of the current window
            results[i - k + 1] = pq.peek().val;
        }

        // Print the results
        for (int result : results) {
            System.out.print(result + " ");
        }
    }
}
