class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> x = new HashMap<>();
        x.put(nums[0],0);
        for (int i = 1 ;i<nums.length ;i++){
         if (x.containsKey(target - nums[i])){
            int[] z = {x.get(target - nums[i]),i};
            return z;
         }
         x.put(nums[i],i);
        }
return nums;
    }
}