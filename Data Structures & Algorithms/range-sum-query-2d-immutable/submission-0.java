class NumMatrix {
    int[][] prefixMatrix;
    public NumMatrix(int[][] matrix) {
        prefixMatrix = new int[matrix.length + 1][matrix[0].length + 1];        
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++){
                int above = prefixMatrix[row][col + 1];
                int left = prefixMatrix[row + 1][col];
                int overlap = prefixMatrix[row][col]; 
                int sum = above + left - overlap + matrix[row][col]; 
                prefixMatrix[row + 1][col + 1] = sum; 
            }
        }
    } 
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = prefixMatrix[row2 + 1][col2+1];
        int top = prefixMatrix[row1][col2 + 1]; 
        int left = prefixMatrix[row2 + 1][col1];
        int overlap = prefixMatrix[row1][col1];

        return total - top - left + overlap;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */