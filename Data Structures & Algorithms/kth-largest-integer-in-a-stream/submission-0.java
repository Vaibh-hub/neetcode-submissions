class KthLargest {
    // aao seekhe desin kaise krte hain... to min heap chaiye... kon kon
    // use krega min heap... agar bhot saare to instance variable banao
    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int n: nums){
            pq.add(n);
            if(pq.size()>k)pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
}
