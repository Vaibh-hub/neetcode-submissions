class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] freq = new int [26];
        for(char c : tasks){
            freq[c-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        
        for(int f : freq){
            if(f>0){
                pq.offer(f);
            }
        }

        int time = 0;
        while(!pq.isEmpty()){
            int cycle = n+1;
            List<Integer> used = new ArrayList<>();
            // lets fill one cycle
            while(cycle>0 && !pq.isEmpty()){
                int f = pq.poll();
                f--;
                if(f>0){
                    used.add(f);
                }
                time++;
                cycle--;
            }
            for(int f : used){
                pq.offer(f);
            }
            if(!pq.isEmpty()){
                time+=cycle;
            }
        }
        return time;
    }
}
