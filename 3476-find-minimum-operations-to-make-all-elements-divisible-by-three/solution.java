class Solution {
    public int minimumOperations(int[] nums) {
     int mod;
     int total=0;
     for (int i =0;i<nums.length;i++)
      {
        mod=nums[i]%3;
        if (mod==0)
         {continue;}
        else 
        { total+=1;}
      }   
      return total;
    }
}
