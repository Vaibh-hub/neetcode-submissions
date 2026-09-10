class Solution {
    public String convertToTitle(int col_no) {
        StringBuilder sb = new StringBuilder();
        // excel sheet is 1 bas index
        while(col_no>0){
            col_no = col_no-1;
            int rem = col_no%26;
            sb.append((char)(rem + 'A'));
            col_no = col_no/26;
        }
        return sb.reverse().toString();
    }
}