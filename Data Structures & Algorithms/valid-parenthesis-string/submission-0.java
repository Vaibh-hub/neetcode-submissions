class Solution {
    public boolean checkValidString(String s) {
        int max_open = 0;
        int min_open = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                max_open++;
                min_open++;
            }else if(c == '*'){
                // can be open bracket
                max_open++;
                // can be closed bracket
                min_open--;
            }else{
                min_open--;
                max_open--;
            }
            if(max_open <0) return false; // too many open brackets
            min_open = Math.max(min_open, 0);
        }

        return min_open == 0;
    }
}
