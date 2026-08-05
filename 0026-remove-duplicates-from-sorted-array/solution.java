class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
       for (int i=0,j=0;i<nums.length;i++){
        if (nums[j]==nums[i])
        { 
            continue;
        }
        else {
            j++;
            nums[j]=nums[i];
            count =j;
        }
       
        }
        return count+1;
        
    }
}
