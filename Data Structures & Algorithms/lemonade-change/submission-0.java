class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {

            if (bill == 5) {
                five++;
            }

            else if (bill == 10) {
                if (five == 0) return false;

                five--;
                ten++;
            }

            else if (bill == 20) {

                // First preference: 10 + 5
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                }

                // Otherwise: 5 + 5 + 5
                else if (five >= 3) {
                    five -= 3;
                }

                else {
                    return false;
                }
            }
        }
        return true;
    }
}