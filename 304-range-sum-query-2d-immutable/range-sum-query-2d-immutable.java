class NumMatrix {
public int[][] x ;
    public NumMatrix(int[][] matrix) {
        this.x = new int[matrix.length][matrix[0].length];
        x[0][0]= matrix[0][0];
        for (int i = 1 ;i < x[0].length ; i ++){
        x[0][i] = matrix[0][i] + x[0][i-1];
        }
        for (int i = 1 ; i <x.length;i++){
             x[i][0] = matrix[i][0] + x[i-1][0];
        }
        for (int i = 1 ; i<x.length ;i++){
            for (int j = 1 ; j<x[0].length ; j++)
{
     x[i][j] =matrix[i][j] + x[i-1][j] +x[i][j-1] - x[i-1][j-1];
}   
     }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int z=0,y=0,overlap=0;
        if (row1 != 0 ){
             z = x[row1-1][col2];
        }
        if (col1 != 0){
             y = x[row2][col1-1];
        }
        if (row1 != 0 && col1 != 0){
              overlap = x[row1-1][col1-1];
        }
        return  x[row2][col2] - y - z + overlap;
        //whn we subtract z and y it oerlaps
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */