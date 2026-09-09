class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;

        if (n <= 1) return n;

        int len = 1;
        int maxlen = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1]) {
                len = 1;
            }
            else if (i == 1 ||
                    (arr[i] > arr[i - 1]) !=
                    (arr[i - 1] > arr[i - 2])) {

                len++;
            }
            else {
                len = 2;
            }

            maxlen = Math.max(maxlen, len);
        }

        return maxlen;
    }
}