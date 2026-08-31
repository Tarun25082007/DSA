class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target<= nums[0]){
            return 0;
        }
        if (target > nums[nums.length-1]){
            return nums.length;
        }
        int beg=0,end=nums.length-1,mid=-1;
        while(end - beg !=1)
       { mid=(beg+end)/2;
       if (target > nums[mid]){
              beg = mid;

       }
       else{
        end = mid;
       }
       
       
        }return end; }
}