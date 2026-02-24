class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int num=1;
        int row=0;
        int col=0;
        while(num<=n*n) {
            while(col<n && matrix[row][col]==0) {
                matrix[row][col]=num++;
                col++;
            }
            col--;
            row++;
            while(row<n && matrix[row][col]==0) {
                matrix[row][col]=num++;
                row++;
            }
            row--;
            col--;
            while(col>=0 && matrix[row][col]==0) {
                matrix[row][col]=num++;
                col--;
            }
            col++;
            row--;
            while(row>=0 && matrix[row][col]==0) {
                matrix[row][col]=num++;
                row--;
            }
            col++;
            row++;
        }
        return matrix;
    }
}