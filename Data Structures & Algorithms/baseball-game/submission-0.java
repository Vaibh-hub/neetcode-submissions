class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {

            if (op.equals("+")) {
                int first = st.pop();
                int second = st.pop();

                int score = first + second;

                st.push(second);
                st.push(first);
                st.push(score);

            } else if (op.equals("D")) {
                st.push(2 * st.peek());

            } else if (op.equals("C")) {
                st.pop();

            } else {
                st.push(Integer.parseInt(op));
            }
        }

        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
}