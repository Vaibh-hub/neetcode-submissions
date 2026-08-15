class Solution {
    public int maxSubarraySumCircular(int[] nums) {
         // key idea kya h bhai??
         // maxsum subarray kya hogi... ya to kadane wali hogi
         // ya fir agar circular hogi to totalsum - minsum subaaray
         // how to do it bhai?
         int total = 0;

         int maxsum = nums[0];
         int currsum = nums[0];

         int minsum = nums[0];
         int mincurr = nums[0];

         for(int i = 0; i<nums.length;i++){
            total+=nums[i];
            if(i>0){
                currsum = Math.max(nums[i],currsum+nums[i]);
                maxsum = Math.max(currsum,maxsum);
            }
            // minsum bhi to nikal bhaiii
            if(i>0){
                mincurr = Math.min(nums[i],mincurr+nums[i]);
                minsum = Math.min(minsum,mincurr);
            }
         }
        // chck kr bhai khi saare elements negatibe to nhi
        if(maxsum<0){
            return maxsum;
        }
        int circularmax = total - minsum;
        return Math.max(maxsum,circularmax);
    }
}