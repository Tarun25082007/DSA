class Solution {
    public int[] rearrangeArray(int[] nums) {
        int nums1[] = new int[nums.length];
        int i = 0 ; int j = 1;
        for (int k = 0 ; k<nums.length;k++){
            if ( nums[k]>0   ){
                nums1[i] = nums[k];
                i+=2;
            }
            else{
                nums1[j] = nums[k];
                j+=2;
            }
        }
        return nums1;
        
    }
}