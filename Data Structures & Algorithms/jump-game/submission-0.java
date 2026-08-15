class Solution {
    public boolean canJump(int[] nums) {
        // try kr bhai maximum kitni door ja skte agar starting se start kre
        int door = 0;
        for(int i = 0; i<nums.length;i++){
            if(i>door){
                // to hum kabhi i pr aa he nhi payenge to false return kr de
                return false;
            }else{
                door = Math.max(door, i+nums[i]);
            }
        }
        if(door>=nums.length-1)return true;
        return false;
    }
}
