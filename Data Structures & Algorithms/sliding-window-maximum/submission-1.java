class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        int left = 0;
        int right = 0;
        int index = 0;

        while (right < n) {

            // Remove elements outside the window
            while (!dq.isEmpty() && dq.peekFirst() < left) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() &&
                   nums[dq.peekLast()] <= nums[right]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(right);

            // Window size becomes k
            if (right - left + 1 == k) {

                // Front contains the maximum
                result[index++] = nums[dq.peekFirst()];

                // Slide window
                left++;
            }

            right++;
        }

        return result;
    }
}
