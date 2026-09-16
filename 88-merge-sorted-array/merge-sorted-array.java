class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m-1;
        int y = n-1;
        int point = nums1.length-1;
        while (y>=0 && x >=0){
            if (nums1[x]<=nums2[y]){
                nums1[point] = nums2[y];
                point --;
                y--;

            }
            else if (nums1[x]>nums2[y]){
                nums1[point] = nums1[x];
                 point --;
                x--;
            }
            
        }
        if (x == -1 && y != -1){
              for(int i=0 ; i <=y;i++){
                nums1[i] = nums2[i];
              }
        }
if (m==0){
    nums1[0] = nums2[0];
}


      
}}