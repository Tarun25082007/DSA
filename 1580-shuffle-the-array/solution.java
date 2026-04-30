class Solution {
    public int[] shuffle(int[] nums, int n) {
        int  num[]=new int[2*n];
        for (int i=0,j=n,k=0;j<2*n && k<2*n && i<n;i++,j++)
        {
          num[k]=nums[i];
          k++;
          num[k]=nums[j];
          k++;
        }
        return num;
    }
}
