class Solution {
    public int maxSubArray(int[] nums) {
     int  currsum = nums[0];
      int maxsum = currsum ;  
      for (int i = 1 ; i <nums.length;i++){
        currsum = Math.max(nums[i] , currsum+nums[i]);
        maxsum = Math.max(currsum,maxsum);
      }
      return maxsum;
    }
}