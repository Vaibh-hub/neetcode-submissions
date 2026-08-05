class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int []result = new int [n];
        Stack<Integer> st = new Stack<>();// store no of days we need
        for( int i = n-1; i>=0;i--){
            while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i]=0;
            }else{
                result[i]= st.peek()-i;
            }
            st.push(i);

        }
        return result;
    }
}