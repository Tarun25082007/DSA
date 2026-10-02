class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0 ; 
        double max = 0 ;
        for (int i = 0 ; i<k ; i++){
            sum += nums[i];
        }
        max = sum/k;
        int i = 0 ;
        int j = k;
        while (j<nums.length ){
            sum-=nums[i++];
            sum+=nums[j++];  
            if (max < (sum/k)){
                max = sum/k;
            } 
              
            
        }
            return max ;
    }
}