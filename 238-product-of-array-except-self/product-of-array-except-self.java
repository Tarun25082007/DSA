class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] x = new int[nums.length];
        int[] y = new int[nums.length];
        x[0] = 1;
        y[nums.length-1] = 1;
        for (int i = 1 ,j = nums.length-2; i<nums.length;i++,j--){
           x[i] =nums[i-1]*x[i-1];
           y[j] = nums[j+1]*y[j+1]; 
        }
        for (int i = 0 ; i < nums.length ; i++){
          x[i]*=y[i];
        }
        return x ; 
    }
}