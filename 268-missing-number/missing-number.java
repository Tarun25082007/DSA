class Solution {
    public int missingNumber(int[] nums) {
        int x = nums[0];
        int y = 0;
   for (int i = 1;i<nums.length ;i++){
   x=x^nums[i];
   y = y ^i;
   }
   y=y^nums.length;
   return x^y ;
    }

}