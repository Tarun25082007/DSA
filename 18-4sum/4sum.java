class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
          List<List<Integer>> x = new ArrayList<>();
        Arrays.sort(nums);
        for(int l = 0;l<nums.length - 3 ; l ++){
             if( l!=0 && nums[l] == nums[l-1]){
                     
                    continue;
                }
      for (int i = l+1;i<nums.length - 2 ; i ++){

           if( i> l+1 && nums[i] == nums[i-1]){
                     
                    continue;
                }
                
               int  j =  i+1;
                int k = nums.length-1;

        while (i<j && j<k){
              

             if ( (long) nums[j]+ nums[k] + nums[i] == (long) target - nums[l]){
              
             x.add(Arrays.asList(nums[i], nums[j], nums[k],nums[l]));

                    j++;
                    while ( j<k && nums[j] == nums[j-1] ){
                        j++;
                    }
                    k--;
                     while (nums[k] == nums[k+1] && k>j){
                        k--;
                    }

             }
               else  if ((long)nums[j]+ nums[k] + nums[i] > (long)target - nums[l]){
                k--;
             }
           else  if ((long)nums[j]+ nums[k] + nums[i] < (long)target - nums[l]){
                j++;
             }  
        }}}
        return x;
        
    }
}