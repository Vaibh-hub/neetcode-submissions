class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int ans = -1;
        int high = 0;
        for(int w : weights){
            low = Math.max(low,w);
            high += w;
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canship(mid,days,weights)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    private boolean canship(int cap, int days, int[]weights){
        int count = 1;
        int curr_cap = 0;
        for(int i = 0; i<weights.length;i++){
            curr_cap = curr_cap + weights[i];
            if(curr_cap>cap){
                count++;
                curr_cap = weights[i];
            }
        }
        return count<=days;
    }
}