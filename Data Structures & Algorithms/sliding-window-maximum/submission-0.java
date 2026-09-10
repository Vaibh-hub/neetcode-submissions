class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n-k+1];
        int idx = 0;
        Deque<Integer> dq = new ArrayDeque<>(); // dq of index, monotonic decreaseing
        for(int right = 0; right<n; right++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[right]){
                dq.pollLast();
            }
            dq.offerLast(right);
            int left = right-k+1;
            while(dq.peekFirst()<left){
                dq.pollFirst();
            }
            if(right>=k-1){
                ans[idx++]=nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}
