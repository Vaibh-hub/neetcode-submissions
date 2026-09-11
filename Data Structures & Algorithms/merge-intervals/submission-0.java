class Solution {
    public int[][] merge(int[][] intervals) {
        // intervals ko sort kr de start time k basis pr
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i =1 ; i<intervals.length;i++){
            // overlap check
            if(intervals[i][0]<=end){
                end = Math.max(end,intervals[i][1]);
            }else{
                // no overlap
                result.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        // add last interval
        result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][]);
    }
}
