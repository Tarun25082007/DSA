class Solution {
    public void rotate(int[][] matrix) {
        int left=0;
        int top=0;
        int bot=matrix.length-1;
        int right =matrix.length-1;
        int count =matrix.length-1;
        while (count>0)
      {  for(int i=0;i<count;i++)
         {
            int temp=matrix[top][left+i];
            matrix[top][left+i]=matrix[bot-i][left];
             matrix[bot-i][left]=matrix[bot][right-i];
              matrix[bot][right-i]=matrix[top+i][right];
              matrix[top+i][right]=temp;
             
         }
         top++;bot--;right--;left++;count-=2;}
       }
        
    }

