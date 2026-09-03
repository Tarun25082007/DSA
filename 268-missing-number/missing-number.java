class Solution {
    public int missingNumber(int[] nums) {
     long  x = ((nums.length +1)*nums.length)/2;
     for (int i =0; i < nums.length ;i++){
        x-=nums[i];
     }
     return (int)x;

    }
}