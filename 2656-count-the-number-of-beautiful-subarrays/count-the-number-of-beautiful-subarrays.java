class Solution {
    public long beautifulSubarrays(int[] nums) {
        int[] x =new int[nums.length+1];
        x[0] = 0;
        for (int i = 0 ;i<nums.length ;i++){
            x[i+1] = x[i] ^ nums[i];
        }
        long count = 0 ;
        HashMap<Integer,Integer> y = new HashMap<>();
        y.put(0,1);
        for(int i = 1 ; i<x.length;i++){
            if (y.get(x[i]) != null){
                count+=y.get(x[i]);
                y.put(x[i],y.get(x[i])+1);
            }
            else{
                y.put(x[i],1);
            }
         
        }   return count;
    }
}