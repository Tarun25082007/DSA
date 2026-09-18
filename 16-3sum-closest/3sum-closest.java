class Solution {
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int sum = 0;
    int co = nums[0] + nums[1] + nums[nums.length-1]; ;
    for (int i = 0 ; i<nums.length -2; i ++){
     int j = i+1;
     int k = nums.length-1;
     if  ( i !=0 && nums[i] == nums[i-1]){
        i++;
        continue;
     }
     while(j<k){
        sum = nums[i] + nums[j] + nums[k];
        if ( Math.abs(target - sum) < Math.abs(target - co )){
            co = sum ;
            }
        if (sum <= target ){
            j++;
            while(j<=k){
                if  ( nums[j] == nums[j-1]){
                     j++;
                    continue;}
                    else{
                        break;
                    }
                }
                continue;
            }
        else if (sum>= target){
                k--;
                while(j<=k){
                if  ( nums[k] == nums[k+1]){
                k--;
                continue;} 
                else {
                    break;
                }  
            }
            continue;

        }
      }
       

    }return co;
}}