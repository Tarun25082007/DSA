class Solution {
    public int subarraySum(int[] nums, int k) {
    int[] x = new int[nums.length+1];
    x[0]=0;
    for (int i = 0 ; i <nums.length ; i++){
        x[i+1] = nums[i] + x[i];
    }
    HashMap<Integer,Integer> y = new HashMap<>();
    
    int count = 0;    
    for (int i = 0 ; i<=nums.length ;i++){
      if (y.containsKey(x[i]-k)){
        count += y.get(x[i]-k);
      }
      if (y.containsKey(x[i])){
        y.put(x[i],y.get(x[i])+1);
      }
      else {
         y.put(x[i],1);
      }
    
    }
    return count;
    }
}