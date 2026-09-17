class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        if (nums.length == 1){
            return nums;
        }
        int i = 0 ;
        int j = 1;
        int temp = 0 ;
        while (i<nums.length && j< nums.length ){
             if (nums[j]%2 == 0){
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i+=2;
             }
             else {
                j+=2;
             }
        }


return nums;

    }
}