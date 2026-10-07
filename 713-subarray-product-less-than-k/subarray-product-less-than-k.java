class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1){
            return 0;
        }
        int count = 0 ;
        int i = 0 ;
        int j = 0 ;
        long pro = 1 ;
     while (j<nums.length  ){
            pro *= nums[j];
         while (pro >= k){
            count += j-i ;
            pro/=nums[i];
            i++;
        }
        j++;
     }
      if (j == nums.length && pro<k){
          while (i<nums.length){
            count += j-i ;
            i++;
          }
         }
        return count ;
    }
}