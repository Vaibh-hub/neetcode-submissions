class Solution {
    public int subarraySum(int[] nums, int k) {
        // dekh bhai prefix sum ka crazy question hai
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>(); // sum, kitne baar
        map.put(0,1);
        // map me store krenge prefix sum up to given index...
        for(int i = 0 ;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                // we got a subarray of sum k
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}