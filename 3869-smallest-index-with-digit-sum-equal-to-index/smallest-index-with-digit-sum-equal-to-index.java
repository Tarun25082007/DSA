class Solution {
    public int smallestIndex(int[] nums) {
       
        int num =0 ; int sum = 0 ; 
        for (int i = 0 ; i <nums.length ; i++){
            num = nums[i];
            while (num>0){
                sum +=num%10;
                num = num/10 ;
               
            }
             if (sum == i ){
                    return i ;
                }
            sum = 0 ;
        }

        return -1;
    }
}