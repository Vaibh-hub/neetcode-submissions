class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int maxarea = 0;
        while(l<r){
            int area = (r-l)*Math.min(heights[r],heights[l]);
            if(area>maxarea){
                maxarea = area;
            }
            if(heights[l]>heights[r]){
                r--;
            }else{
                l++;
            }
        }
        return maxarea;
    }
}
