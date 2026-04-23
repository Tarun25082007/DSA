class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,k=1;
        while(i<nums.length){
        if(nums[i-1]!=nums[i])
        {nums[k]=nums[i];
        i++;
        k++;
        continue;
        }
        i++;
    }
return k;
}
}
