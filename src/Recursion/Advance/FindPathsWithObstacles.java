package Recursion.Advance;

import java.util.Arrays;

public class FindPathsWithObstacles {
    public static void main(String[] args) {
        int [][] grid = {
                {0,0,0},
                {0,0,0},
                {0,0,1}
        };
        int m = grid[0].length , n =  grid.length;
        int [][] dp = new int[n+1][m+1];
        Arrays.fill(dp,-1);
        int paths = findPaths(grid, 0 , 0 ,n , m,dp);
        System.out.println(paths);
    }
    private static int findPaths(int [][] grid, int row ,int col , int n , int m,int[][]dp){
        if(row >= n || col >= m) return 0;
        if(grid[row][col] == 1) return 0;
        if(row == n-1 && col == m-1) return 1;
        if(dp[row][col] != -1) return dp[row][col];
        return dp[row][col] =  findPaths(grid,row+1, col,n,m,dp) + findPaths(grid,row,col+1,n,m,dp);
//        return totalPaths;
    }
}
