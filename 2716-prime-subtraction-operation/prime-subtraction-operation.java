class Solution {
    public boolean primeSubOperation(int[] nums) {
        int max = 0 ;
        for (int i = 0 ; i <nums.length ;i++){
            if (nums[i] > nums[max]){
                max = i;
            }
        }
        boolean[] p = new boolean[nums[max]];
        for(int i = 2 ; i*i<p.length ;i++ ){
            for (int j = i*i;j<p.length;j+=i){
                p[j] = true;
            }

        }
        boolean t = true; 
        for (int i = 0 ;i < nums.length ; i ++){
          
            for (int j = nums[i]-1;j>1;j--){
                if (!p[j]){
                   if (i == 0 ){
                    nums[i] -= j; 
                break;
                   }
                   else if  ( (nums[i]-j) > (nums[i-1]) )
                   {
                    nums[i] -= j; 
                break;
                   }
                   
                   }
            }
              for (int k = 0 ; k <nums.length-1 ;k++){
                   if (nums[k]>=nums[k+1]){
                    t = false;
                    break;
                   }
            }
            if (t){
                return t;
            }
            t = true;
             if (i!=0 && nums[i]<= nums[i-1]){
                return false;
            }
           
          
        }
        return true;
        
    }
}