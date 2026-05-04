class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
       int x=4;
       while(x>0){if (Arrays.deepEquals(mat,target))
     {return true;}
        int left=0;
        int top=0;
        int bot=mat.length-1;
        int right =mat.length-1;
        int count =mat.length-1;
        while (count>0)
      {  for(int i=0;i<count;i++)
         {
            int temp=mat[top][left+i];
            mat[top][left+i]=mat[bot-i][left];
             mat[bot-i][left]=mat[bot][right-i];
              mat[bot][right-i]=mat[top+i][right];
              mat[top+i][right]=temp;
             
         }
         top++;bot--;right--;left++;count-=2;}
         x--;}
         return false;

  
    }
}
