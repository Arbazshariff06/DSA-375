class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int l = mat[0].length;

        if ((m * l) != (r * c))
            return mat;

        int[][] matrix = new int[r][c];

        int row = 0;
        int col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                matrix[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return matrix;
    }
}