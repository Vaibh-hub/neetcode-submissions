class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        for(int p : piles) {
            high = Math.max(high, p);
        }
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(canfinish(piles, mid, h)) {
                ans = mid;
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canfinish(int[] piles, int k, int h) {
        int hour = 0;
        for(int p : piles) {
            hour += (p + k - 1) / k;
        }
        return hour <= h;
    }
}