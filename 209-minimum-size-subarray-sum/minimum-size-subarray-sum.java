class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size = nums.length +1;
        int i = 0 ;
        int j = 0 ;int sum = nums[0];
        while (j<nums.length ){
           if (size == 1 ){
            return 1 ;
           }
         
         
           if (sum == target ){
            if (size > j-i+1){
                size = j-i+1;
            }
            sum -= nums[i];
            i++;
            if (j!= nums.length-1 ){
                j+=1;
                sum+=nums[j];
            }
           }
           else if (sum < target){
            if (j== nums.length -1){
                break ; 
            }
         j+=1;
             sum+=nums[j];
            
           }
           else {
             if (size > j-i+1){
                size = j-i+1;
            }
            sum -= nums[i];
            i++;
           }

        }
        if (size>nums.length){
            return 0 ;
        }
        return size ;
    }
}