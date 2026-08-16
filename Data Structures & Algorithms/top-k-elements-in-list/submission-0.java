class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Store number with its frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        // Min heap based on frequency
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(
                (a, b) -> Integer.compare(map.get(a), map.get(b))
            );
        // Only add unique numbers
        for (int n : map.keySet()) {
            pq.add(n);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = pq.poll();
        }
        return arr;
    }
}
