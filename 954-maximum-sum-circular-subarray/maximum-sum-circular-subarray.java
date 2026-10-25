class Solution {
    public int maxSubarraySumCircular(int[] nums) { 
       int  currsum = nums[0];
       int totalsum = nums[0];
      int maxsum = currsum ;
      int  currsum2 = nums[0]; 
      int minsum = currsum2; 
      for (int i = 1 ; i <nums.length;i++){
        currsum = Math.max(nums[i] , currsum+nums[i]);
        maxsum = Math.max(currsum,maxsum);
        currsum2 = Math.min(nums[i] , currsum2+nums[i]);
        minsum = Math.min(currsum2,minsum);
        totalsum+=nums[i];
      }
      if (maxsum<0){
        return maxsum;
      }
      if (minsum != maxsum && minsum<0){
             return Math.max(maxsum, totalsum - minsum);
      }
      return maxsum;
    }
}