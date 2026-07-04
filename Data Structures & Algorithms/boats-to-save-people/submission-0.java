class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0;
        int r = people.length-1;
        int count = 0;
        while(l<=r){
            int heavy = people[r];
            int light  = people[l];
            if(heavy + light<=limit){
                count++;
                l++;
                r--;
            }else{
                count++;
                r--;
            }
        }
        return count;
    }
}