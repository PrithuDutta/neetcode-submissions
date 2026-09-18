class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0; 

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                int area = areaDFS(i, j, grid, 0); 

                if(maxArea < area) {
                    maxArea = area; 
                }
            }
        }

        return maxArea; 
    }

    public int areaDFS(int row, int col, int[][] grid, int area) {

        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != 1) {
            return area; 
        }

        grid[row][col] = -1; 
        area++; 

        area = areaDFS(row + 1, col, grid, area); 
        area = areaDFS(row - 1, col, grid, area); 
        area = areaDFS(row, col + 1, grid, area); 
        area = areaDFS(row, col - 1, grid, area);  

        return area; 
    }
}
