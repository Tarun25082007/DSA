class Solution {
    public int compareBitonicSums(int[] nums) {
      long s1=0;
        long s2=0;
        int comp=0;
        int max=0;
        int pos=0;
         for (int i =0;i<nums.length;i++)
             { if (nums[i]>max)
             {  max=nums[i];
                 pos=i;}}
        for (int i =0;i<nums.length;i++)
            {
                if (i<pos)
                    {s1+=nums[i];}
                else if (i>pos)
                    {s2+=nums[i];}
            }
        s1+=max;
        s2+=max;
        if (s1>s2)
            comp=0;
        else if(s1==s2)
            comp=-1;
        else
            comp=1;
        return comp;
    }
}
