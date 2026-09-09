class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n%groupSize !=0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int card : hand){
            map.put(card,map.getOrDefault(card,0)+1);
        }

        // lets form groups
        while(!map.isEmpty()){
            int firstcard = map.firstKey();
            for(int i = 0; i<groupSize;i++){
                int currcard = firstcard+i;
                if(!map.containsKey(currcard))return false;
                if(map.get(currcard)==1){
                    map.remove(currcard);
                }else{
                    map.put(currcard,map.get(currcard)-1);
                }
            }
        }
        return true;
    }
}
