class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct = nums[0];
        int minproduct = nums[0];
        int answer = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxproduct;
                maxproduct = minproduct;
                minproduct = temp;
            }
            maxproduct = Math.max(nums[i], maxproduct * nums[i]);
            minproduct = Math.min(nums[i], minproduct * nums[i]);
            answer = Math.max(answer, maxproduct);
        }
        return answer;
    }
}
