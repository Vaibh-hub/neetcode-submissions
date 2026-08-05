class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int a : asteroids){
            while(!st.isEmpty() && a<0 && st.peek()>0){
                int sum = a + st.peek();
                if(sum<0){
                    st.pop();
                }else if(sum>0){
                    a=0;
                }else{
                    st.pop();
                    a=0;
                }
                
            }
              if(a!=0){
                    st.push(a);
                }
        }
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}