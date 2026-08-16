class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int s: stones){
            q.add(s);
        }
        while(q.size()>1){
            int max1 = q.poll();
            int max2 = q.poll();
            int diff = max1-max2;
            if(diff==0) continue;
            else{
                q.add(diff);
            }
        }
        if(q.size()==0) return 0;
        else return q.poll();
    }
}
