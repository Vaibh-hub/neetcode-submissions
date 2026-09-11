 
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        // Case 1: Current interval completely before new interval
        while (i < intervals.length &&
               intervals[i][1] < newInterval[0]) {

            ans.add(intervals[i]);
            i++;
        }
        // Case 2: Overlapping intervals
        while (i < intervals.length &&
               intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        // Add merged interval
        ans.add(newInterval);
        // Case 3: Remaining intervals
        while (i < intervals.length) {
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}

