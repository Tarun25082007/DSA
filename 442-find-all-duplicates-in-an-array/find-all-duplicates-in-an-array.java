class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    Set<Integer> x = new HashSet<>();
        for(int i = 0 ; i <nums.length;i++){
                 if (nums[Math.abs(nums[i])-1]<0){
                  x.add(Math.abs(nums[i]));
                 }
                 else {
                    nums[Math.abs(nums[i])-1] *= -1;
                 }
        }
        List<Integer> y = new ArrayList<>(x);
        return y;
        
    }
}