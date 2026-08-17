class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // sbse phle sort kr de bhai kis basis prr?
        // on the basis of pickp to drop.... moving lefrtt to write
        Arrays.sort(trips, (a,b)-> Integer.compare(a[1],b[1]));
        
        // ab kya kru bhai?
        // min heap bana de on basis of drop location... intutive h
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);

        int passenger = 0;
        for(int []trip : trips){
            int num = trip[0];
            int from = trip[1];

            // jo log destination pahunch gye unko bahar kro
            while(!pq.isEmpty() && pq.peek()[2]<=from){
                passenger = passenger - pq.poll()[0];
            }
            passenger+=num;
            if(passenger>capacity) return false;
            pq.offer(trip);
        }
        return true;
    }
}