class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        int mod;
        for(int i = 0;i<nums.length;i++)
         sum+=nums[i];
        mod=sum%k;
        return mod;
    }

}
