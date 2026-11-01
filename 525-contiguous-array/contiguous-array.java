class Solution {
    public int findMaxLength(int[] nums) {
       int[] x = new int[nums.length];
       Map<Integer,Integer> y = new HashMap<>();
      x[0]=(nums[0]>0)?1:-1;
       int temp = 0 ;
        y.put(x[0],0);
       for (int i = 1; i<nums.length;i++)
       {
       
            temp=(nums[i]>0)?1:-1;
              x[i] = x[i-1] + temp ; 
               y.put(x[i],i);
       }
     
        int max = 0 ;
        int z = 0 ;
        for (int i = 0 ; i<nums.length ; i++)
        {  if (x[i]== 0 ){
            z = i;
        }
            max = (max>y.get(x[i])-i)?max:y.get(x[i])-i;
        }
        if (max == 0 && z == 0){
            return 0;
        }
        return Math.max(max,z+1) ;
    }
}