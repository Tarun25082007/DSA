class Solution {
    public int maxProduct(int[] nums) {
      long max = 0 ; 
      boolean c = false;
      long t1= 0;
      long t2 = 0;
        for (int i = 0 ; i<nums.length ;i++){
            if (nums[i] == 0 ){
                c = false ;
                t1 = 0;
                t2 = 0 ;
            }
           if (c){
            if (t1 == 0 ){
                t1 = nums[i];
            }
            else {
            t1 = t1*nums[i];
           }}
           if (t2 == 0 ){t2 = nums[i];}
           else{t2 *=nums[i];}
           if (nums[i] < 0){
            c = true;
           }
           max = Math.max(max,Math.max(t1,t2));
        }
         if (nums.length == 1){
            return nums[0];
         }
      return (int)max;
    }
}