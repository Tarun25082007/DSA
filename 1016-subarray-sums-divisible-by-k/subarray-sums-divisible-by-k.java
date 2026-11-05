class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      int[] x = new int[nums.length+1];
    x[0]=0;
    for (int i = 0 ; i <nums.length ; i++){
        x[i+1] = nums[i] + x[i];
    }
    HashMap<Integer,Integer> y = new HashMap<>();
    
    int count = 0;    
    int rem = 0 ;
    for (int i = 0 ; i<=nums.length ;i++){
         rem =x[i]%k;
      if (rem<0){
        rem +=k; 
      }
      if (y.containsKey(rem)){
        count += y.get(rem);
      }
     
      if (y.containsKey(rem)){
        y.put(rem,y.get(rem)+1);
      }
      else {
         y.put(rem,1);
      }
    
    }
    return count;
    }
}