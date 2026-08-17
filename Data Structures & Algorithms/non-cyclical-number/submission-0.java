class Solution {
    private int square(int n) {
        int sum = 0;
        while(n != 0) {
            int ld = n % 10;
            sum += ld * ld;
            n = n / 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = square(slow);
            fast = square(square(fast));
        } while(slow != fast);
        return slow == 1;
    }
}
