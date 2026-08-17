class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            // Agar 9 nahi hai
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // 9 hai toh 0 bana do
            digits[i] = 0;
        }
        // Sab digits 9 the
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }
}