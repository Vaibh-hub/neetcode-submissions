class Solution {
    public int majorityElement(int[] nums) {
        int major = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                major = num;
                count = 1;
            } else if (num == major) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }
}