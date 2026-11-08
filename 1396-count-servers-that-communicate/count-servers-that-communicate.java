class Solution {
    public int countServers(int[][] grid) {
        int total = 0 ;
        int[] x = new int[grid.length];
        int[] y = new int[grid[0].length];
        for (int i = 0 ; i <grid.length;i++){
            for (int j = 0 ; j <grid[0].length;j++){
                total+=grid[i][j];
                x[i]+=grid[i][j];
                y[j]+=grid[i][j];
        }
        }
        for (int i = 0 ; i <grid.length;i++){
            for (int j = 0 ; j <grid[0].length;j++){
                if(x[i]== 1 && y[j]==1)
               { total-=grid[i][j];}
        }
        }
        return total;
    }
}