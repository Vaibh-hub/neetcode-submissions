class Solution {

    private void reverse(int row[]) {
        int i = 0;
        int j = row.length - 1;

        while(i < j) {
            int temp = row[j];
            row[j] = row[i];
            row[i] = temp;

            i++;
            j--;
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for(int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
    }
}  
