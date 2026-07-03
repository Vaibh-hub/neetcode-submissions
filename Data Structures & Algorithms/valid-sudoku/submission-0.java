class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val == '.') continue;
                String rowKey = val + " in row " + i;
                String colKey = val + " in col " + j;
                String boxKey = val + " in box " + (i / 3) + "-" + (j / 3);
                if (set.contains(rowKey) || set.contains(colKey) || set.contains(boxKey)) {
                    return false;
                }
                set.add(rowKey);
                set.add(colKey);
                set.add(boxKey);
            }
        }
        return true;
    }
}